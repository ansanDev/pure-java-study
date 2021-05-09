package Thread_Ex2;

public class Park extends Thread{
	@Override
	public void run() {
		BankMain.myBank.saveMoney(5000);
		System.out.println("남편 예금 후 잔고 확인 :" + BankMain.myBank.getMoney());
	}
}
