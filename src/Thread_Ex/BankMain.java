package Thread_Ex;

public class BankMain {
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("원금 : " + myBank.getMoney());

		Park park = new Park();
		ParkWife wife = new ParkWife();
		
		park.setPriority(10);
		park.start();
		wife.start();
		
		//main이 park,wife를 기다렸다가 종료되게끔..
		park.join();
		wife.join();
		
		System.out.println("은행 작업 종료");
	}

}
