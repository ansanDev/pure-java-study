package Thread_WaitNotify_Ex;

public class BreadPlate {
	private int breadCount = 0;
	
	public BreadPlate() {
		
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("빵 생산 초과");
				
				wait(); //Thread를 Not Runnable 상태로 전환
				
			} catch(Exception e) {
				
			}
		}
		breadCount++; //빵 생산
		System.out.println("빵을 만듬. 총 "+ breadCount+"개");
		
		notify(); //Thread를 Runnable 상태로 전환
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			try {
				System.out.println("빵이 없어 기다림");
				
				wait();
				
			} catch(Exception e) {
				
			}
		}
		breadCount--;
		System.out.println("빵을 먹음. 총 "+ breadCount + "개");
		
		notify();
	}

}
