package Thread_Ex;

public class Bank {
	private int money = 10000; //������ �ڿ�
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//�Ա�
	public void saveMoney(int save) {
		int m = money;
		try {
			Thread.sleep(2000); //�����ð� 2��
 		} catch(Exception e) {
 		}
		
		money = m + save;
		System.out.println("�Ա�ó��");
	}
	
	public void minusMoney(int minus) {  //���
		int m = money;
		try {
			Thread.sleep(3000); //�����ð� 3��
		} catch(Exception e) {
			
		}
		money = m - minus;
		System.out.println("��� �Ϸ�");
	}
}
