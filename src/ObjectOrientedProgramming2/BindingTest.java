package ObjectOrientedProgramming2;

public class BindingTest {
	public static void main(String[] args) {
		Parernt p = new Children();
		Children c = new Children();
		
		System.out.println("p.x="+p.x);
		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();
		
	}
	
}

class Parernt{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Children extends Parernt{
	int x = 200;
	void method() {
		System.out.println("Children Method");
	}
}
