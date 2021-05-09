package Thread_WaitNotify_Ex;

public class BreadPlate {
	private int breadCount = 0;
	
	public BreadPlate() {
		
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("�� ���� �ʰ�");
				
				wait(); //Thread�� Not Runnable ���·� ��ȯ
				
			} catch(Exception e) {
				
			}
		}
		breadCount++; //�� ����
		System.out.println("���� ����. �� "+ breadCount+"��");
		
		notify(); //Thread�� Runnable ���·� ��ȯ
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			try {
				System.out.println("���� ���� ��ٸ�");
				
				wait();
				
			} catch(Exception e) {
				
			}
		}
		breadCount--;
		System.out.println("���� ����. �� "+ breadCount + "��");
		
		notify();
	}

}
