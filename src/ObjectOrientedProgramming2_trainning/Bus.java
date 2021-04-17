package ObjectOrientedProgramming2_trainning;

public abstract class Bus {
	int income;
	int fee;
	int seat;

	//직진
	void goStraight() {
		System.out.println("직진을 합니다.");
	};
	
	//우회전
	void turnRight() {
		System.out.println("우회전을 합니다.");
	}
	
	//좌회전
	void turnLeft(){
		System.out.println("좌회전을 합니다.");
	}
	
	//멈춤
	void stop(){
		System.out.println("멈춥니다.");
	}
		
	//돈을 받음
	abstract void recieveMoney();

	//승객을 태움
	abstract void pickUpPassengers();
	
	//승객이 내링
	abstract void  getOffPassenger();

	
	//최종 목적지 설정
	abstract void setDestination();
}
