package ObjectOrientedProgramming2;

class Card3{
	final int NUMBER; //상수지만 선언과 함께 초기화 하지 않고
	final String KIND; //생성자에서 단 한번만 초기화할 수 있음
	static int width = 100;
	static int height = 250;
	
	//매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화
	Card3(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card3(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" "+ NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		
		Card3 c = new Card3("HEART", 10);
		//c.NUMBER = 5; //불가
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
