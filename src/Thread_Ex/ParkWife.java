package Thread_Ex;

public class ParkWife extends Thread{
	@Override
	public void run() {
		BankMain.myBank.minusMoney(2000);
		System.out.println("�Ƴ� ��� �� �ܰ� Ȯ�� :" + BankMain.myBank.getMoney());
	}
}
