package Thread_Ex2;

public class ParkWife extends Thread{
	@Override
	public void run() {
		BankMain.myBank.minusMoney(2000);
		System.out.println("아내 출금 후 잔고 확인 :" + BankMain.myBank.getMoney());
	}
}
