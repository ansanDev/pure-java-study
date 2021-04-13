package ObjectOrientedProgramming2;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D3 p = new Point3D3();
		System.out.println("p.x="+p.x);
		System.out.println("p.y="+p.y);
		System.out.println("p.z="+p.z);

	}

}

class Point3 {
	int x=10;
	int y=20;
	
	Point3(int x, int y){
		//super(); -> Object();
		this.x = x;
		this.y = y;
	}
}

class Point3D3 extends Point3{
	int z = 30;
	
	Point3D3(){
		this(100, 200, 300);
	}
	
	Point3D3(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}