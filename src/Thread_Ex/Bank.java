package Thread_Ex;

public class Bank {
	private int money = 10000; //공유될 자원
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//입금
	public void saveMoney(int save) {
		int m = money;
		try {
			Thread.sleep(2000); //지연시간 2초
 		} catch(Exception e) {
 		}
		
		money = m + save;
		System.out.println("입금처리");
	}
	
	public void minusMoney(int minus) {  //출금
		int m = money;
		try {
			Thread.sleep(3000); //지연시간 3초
		} catch(Exception e) {
			
		}
		money = m - minus;
		System.out.println("출금 완료");
	}
}
