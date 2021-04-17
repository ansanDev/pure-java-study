package ObjectOrientedProgramming2_trainning;

public class SeatBus extends Bus{

	int income;
	int fee = 1000;
	int seat = 2;
	
	@Override
	void setDestination() {
		System.out.println("이 버스의 종착역은  영등포입니다.");
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
		return "좌석버스";
	}
	
}
