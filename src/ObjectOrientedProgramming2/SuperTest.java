package ObjectOrientedProgramming2;

public class SuperTest {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2{
	int x = 10;
}

class Child2 extends Parent2{
	int x = 5;
	void method() {
		System.out.println("x="+x);				//5
		System.out.println("this.x="+this.x);   //5
		System.out.println("super.x="+super.x);//10
	}
}
