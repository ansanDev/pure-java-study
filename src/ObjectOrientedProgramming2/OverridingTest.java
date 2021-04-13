package ObjectOrientedProgramming2;

// https://blog.naver.com/gngh0101/221206214829
class Parent{
	public static void staticMethod() {
		System.out.println("Parent staticMethod()");
	}
	public void instanceMethod() {
		System.out.println("Parent instanceMethod()");
	}
}

class Child extends Parent{
	public static void staticMethod() {
		System.out.println("Child staticMethod()");
	}
	public void instanceMethod() {
		System.out.println("Child instanceMethod()");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		//1.
		Parent p1 = new Parent();
		//Parent.staticMethod()
		p1.staticMethod();	//Parent staticMethod()
		p1.instanceMethod();//Parent instanceMethod()
		
		//2.
		Child c1 = new Child();
		//Child.staticMethod()
		c1.staticMethod();	//Child staticMethod()
		c1.instanceMethod();//Child instanceMethod()
		
		//3.
		Parent p2 = new Child();
		//Parent.staticMethod();
		p2.staticMethod();   //Parent staticMethod()
		p2.instanceMethod(); //Child instanceMethod()

	}

}
