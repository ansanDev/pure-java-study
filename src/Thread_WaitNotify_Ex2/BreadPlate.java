package Thread_WaitNotify_Ex2;

public class BreadPlate {
	private int breadCount = 0;
	
	public BreadPlate() {
		
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("�� ���� �ʰ�");
			} catch(Exception e) {
				
			}
		}
		breadCount++; //�� ����
		System.out.println("���� ����. �� "+ breadCount+"��");
		
		//�Ϻη� ���� 10�������� �Ѿ �����ϰ� ����
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			try {
				System.out.println("���� ���� ��ٸ�");
			} catch(Exception e) {
				
			}
		}
		breadCount--;
		System.out.println("���� ����. �� "+ breadCount + "��");
		
		//�Ϻη� ���� ��� ���� ��  �ְ� ����
	}

}
