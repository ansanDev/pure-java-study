package ObjectOrientedProgramming2_trainning;

public class TakeBus {

	public static void main(String[] args) {
		Passenger passenger1 = new Passenger();
		Passenger passenger2 = new Passenger();
		Passenger passenger3 = new Passenger();
		SeatBus seatBus = new SeatBus();
		LocalBus localBus = new LocalBus();
		passenger1.takeBus(seatBus.fee, seatBus, seatBus.seat);
		System.out.println();
		
		passenger2.takeBus(seatBus.fee, seatBus, seatBus.seat);
		System.out.println();
		
		passenger3.takeBus(seatBus.fee, seatBus, seatBus.seat);
		System.out.println();
		
		passenger2.getOffBus(seatBus);
		System.out.println();
		
		passenger1.getOffBus(seatBus);
		System.out.println();
		
		passenger1.takeBus(localBus.fee, localBus, localBus.seat);
		

	}

}
