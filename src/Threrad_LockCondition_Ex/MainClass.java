package Threrad_LockCondition_Ex;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Toilet {
	public int paper;
	
	public Toilet() {
		this.paper = 5;
	}
	
	public void setPaper(int paper) {
		this.paper = paper;
	}
	
	public int getPaper() {
		return paper;
	}
	
	public void usePaper() {
		this.paper--;
	}
}

class Cleaner implements Runnable {
	private Toilet toilet;
	
	private ReentrantLock lock;
	private Condition forCleaner;
	private Condition forPerson;
	
	public Cleaner(Toilet toilet, ReentrantLock lock, Condition forCleaner, Condition forPerson) {
		this.toilet = toilet;
		this.lock = lock;
		this.forCleaner = forCleaner;
		this.forPerson = forPerson;
	}
	
	public void replacePaper(int p) {
		toilet.setPaper(p);
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		while(true) {
			//ȭ����� ȥ�ڸ� ��밡��
			//���� �����尡 �������� ����
			//����ִٸ� lock�� ���������� ��� ���
			lock.lock();
			try {
				//������ ������ �ʿ䰡 ���ٸ� ���� ����
				if(toilet.getPaper() <= 0) {
					System.out.println(name + " replaces toilet paper.");
					replacePaper(5);
					//�ٸ� ����鿡�� ȭ����� ��� �������� �˷���
					System.out.println("Finish Wake everybody");
					forPerson.signalAll();
				}
				
				try {
					//���� ������ ����ϸ� �ٷ� ȭ����� ���ͼ� �ڽ��� ���Ƿ� �̵�
					System.out.println(name + " Go to wait");
					forCleaner.await();
					Thread.sleep(500);
					System.out.println(name+" wakes.");
				} catch(Exception e) {
					e.printStackTrace();
				}
			} 
			finally {
				lock.unlock();
			}
		}
	}
	
}

class User implements Runnable {
	private Toilet toilet;
	
	private ReentrantLock lock;
	private Condition forCleaner;
	private Condition forPerson;
	
	//����ؾ��ϴ� ȭ����� ����
	//lock, lock�� ���� Condition �ν��Ͻ� ����
	public User(Toilet toilet, ReentrantLock lock, Condition forCleaner, Condition forPerson) {
		this.toilet = toilet;
		this.lock = lock;
		this.forCleaner = forCleaner;
		this.forPerson = forPerson;
	}
	
	//ȭ����� ������ �ִ��� Ȯ��
	public boolean checkToilet() {
		return toilet.getPaper() >= 1;
	}
	
	public void usePaper() {
		//���� �ϳ� ��� �� ������ ����
		toilet.usePaper();
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		while(true) {
			//ȭ����� �ѻ���� ��� ����
			lock.lock();
			try {
				//ȭ��ǿ� ������ �ִ��� Ȯ��
				//������ ������ ��� ���
				while(toilet.getPaper() < 1) {
					System.out.println(name + " is waiting for rreplacing papaer.");
					
					try {
						//��� ���� û�Һ� ��ȯ
						forCleaner.signal();
						//������ �����Ƿ� ��� pool�� �̵�
						forPerson.await();
						Thread.sleep(5000);
						System.out.println(name + " wakes");
					} catch(Exception e) {
						e.printStackTrace();
						
					}
				}
				
				//ȭ��� �� ���� ���� ������ ��� �� ȭ��� ����� ����
				System.out.println(name + " uses toilet.");
				usePaper();
				try {
					//������ ������ �ٸ� ����� ���� û�Һο��� �˸�
					if(toilet.getPaper() <= 0) {
						forCleaner.signal();
					}
					// �ڽ��� ȭ����� ����
					forPerson.await();
					Thread.sleep(500);
				} catch(Exception e) {
					
				}
			} finally {
				lock.unlock();
			}
		}
	}
	
	
	
}

public class MainClass {
	private static Toilet toilet = new Toilet();
	private static ReentrantLock lock = new ReentrantLock();
	private static Condition forCleaner = lock.newCondition();
	private static Condition forPerson = lock.newCondition();
	
	public static void main(String[] args) {
		//�����ϴ� ȭ����� ����
		Cleaner cleaner = new Cleaner(toilet, lock, forCleaner, forPerson);
		Thread cleanerThread = new Thread(cleaner, "cleaner");
		cleanerThread.start();
		
		User[] user = new User[5];
		for(int i=0; i<user.length; i++) {
			//�����ü����. �̻���� ����ؾ��ϴ� ȭ��ǵ� ����
			user[i] = new User(toilet, lock, forCleaner, forPerson);
			Thread th = new Thread(user[i],"Person-" + i);
			//��� ��ü�� �ൿ��Ű�� �����带 ����
			 th.start();
		}
	}
}
