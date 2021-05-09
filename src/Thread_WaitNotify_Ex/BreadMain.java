package Thread_WaitNotify_Ex;

public class BreadMain {

	public static void main(String[] args) {
		BreadPlate breadPlate = new BreadPlate();
		BreadMaker breadMaker = new BreadMaker(breadPlate);
		BreadEater breadEater = new BreadEater(breadPlate);
		
		breadMaker.start();
		breadEater.start();
	}
}
