package ObjectOrientedProgramming2;

public class BindingTest2 {

	public static void main(String[] args) {
		Parenrt2 p = new Children2();
		Children2 c = new Children2();
		
		System.out.println("p.x="+p.x);
		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();

	}

}

class Parenrt2{
	int x = 100;
	
	void method() {
		System.out.println("Parenrt2 Method");
	}
}

class Children2 extends Parenrt2 {}