package ObjectOrientedProgramming2_trainning;

public class LocalBus extends Bus{

	int income;
	int fee = 500;
	int seat = 4;
	
	@Override
	void setDestination() {
		System.out.println("광화문까지 가는 버스입니다.");
	}
	
	void recieveMoney() {
		income += fee; 
		System.out.println("현재 버스의 수입은 "+income +"입니다.");
		pickUpPassengers();
	}
	
	//승객을 태움
	void pickUpPassengers(){
		seat -= 1;
		setDestination();
	}		
	
	//승객이 내링
	void  getOffPassenger() {
		seat += 1;
	}
	
	public String toString() {
		return "지역버스";
	}


}
