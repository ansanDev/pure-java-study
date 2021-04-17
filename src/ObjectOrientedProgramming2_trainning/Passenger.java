package ObjectOrientedProgramming2_trainning;

public class Passenger {
	int money;
	boolean isTakeBus = false;

	Passenger(){
		this(1500);
	}
	
	Passenger(int money){
		this.money = money;
	}
	
	boolean pay(int fee) {
		System.out.println("버스 요금은 "+fee+"입니다.");
		if(money < fee) {
			System.out.println("현재 잔액이 "+money+"이므로 돈이 부족하여 버스를 탈 수 없습니다.");
			return false;
		}
		money -= fee;
		System.out.println("요금 "+ fee +"원을 지불합니다.");
		System.out.println("현재 잔액은 "+ money +"입니다.");
		return true;
	}
	
	boolean takeBus(int fee, Bus bus, int seat) {
		System.out.println("현재 탑승버스의 잔여좌석은 "+seat+"개 입니다.");
		if(!isTakeBus) {
			if(seat > 0) {
				if(pay(fee)) {
					System.out.println("버스에 탑승합니다.");
					bus.recieveMoney();
					isTakeBus = true;
					return true;
				}else {
					System.out.println("버스에 탑승하지 못했습니다.");
					return false;
				}
			}else {
				System.out.println("좌석이 부족하여 버스에 탑승할 수 없습니다.");
			}
		} else {
			System.out.println("이미 버스에 탑승한 상태이므로 다른 버스는 탑승할 수 없습니다.");
		}
		return false;
	}
	
	void getOffBus(Bus bus) {
		if(isTakeBus) {
			isTakeBus = false;
			System.out.println("버스에서 내립니다.");	
			bus.getOffPassenger();
		}else {
			System.out.println("버스를 탑승한 적이 없으므로 내릴 수 없습니다.");	
		}
	}
}
