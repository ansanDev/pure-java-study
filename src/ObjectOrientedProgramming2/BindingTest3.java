package ObjectOrientedProgramming2;

public class BindingTest3 {

	public static void main(String[] args) {
		
		Parent3 p = new Children3();
		Children3 c = new Children3();
		
		System.out.println("p.x="+p.x); //100
		p.method();
		
		System.out.println("c.x="+c.x);	//200
		c.method();
		

	}

}

class Parent3{
	int x = 100;
	
	void method() {
		System.out.println("Paretn3 Method");
	}
}

class Children3 extends Parent3{
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); 
		System.out.println("super.x=" + super.x);//100
		System.out.println("this.x=" + this.x); //200
	}
}