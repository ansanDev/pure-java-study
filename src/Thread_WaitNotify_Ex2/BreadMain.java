package Thread_WaitNotify_Ex2;

public class BreadMain {

	public static void main(String[] args) {
		BreadPlate breadPlate = new BreadPlate();
		BreadMaker breadMaker = new BreadMaker(breadPlate);
		BreadEater breadEater = new BreadEater(breadPlate);
		
		breadEater.setPriority(10);
		breadMaker.start();
		breadEater.start();
	}

}
