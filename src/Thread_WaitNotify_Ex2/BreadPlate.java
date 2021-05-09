package Thread_WaitNotify_Ex2;

public class BreadPlate {
	private int breadCount = 0;
	
	public BreadPlate() {
		
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("빵 생산 초과");
			} catch(Exception e) {
				
			}
		}
		breadCount++; //빵 생산
		System.out.println("빵을 만듬. 총 "+ breadCount+"개");
		
		//일부러 빵이 10개생산을 넘어도 가능하게 설정
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			try {
				System.out.println("빵이 없어 기다림");
			} catch(Exception e) {
				
			}
		}
		breadCount--;
		System.out.println("빵을 먹음. 총 "+ breadCount + "개");
		
		//일부러 빵이 없어도 먹을 수  있게 설정
	}

}
