package Thread_Ex;

public class BankMain {
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("���� : " + myBank.getMoney());

		Park park = new Park();
		ParkWife wife = new ParkWife();
		
		park.setPriority(10);
		park.start();
		wife.start();
		
		//main�� park,wife�� ��ٷȴٰ� ����ǰԲ�..
		park.join();
		wife.join();
		
		System.out.println("���� �۾� ����");
	}

}
