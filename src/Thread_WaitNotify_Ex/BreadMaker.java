package Thread_WaitNotify_Ex;

public class BreadMaker extends Thread{
	private BreadPlate plate; //공유될 빵접시
	
	public BreadMaker(BreadPlate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			plate.makeBread();
		}
	}
}
