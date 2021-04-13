package ObjectOrientedProgramming2;
class Tv2{
	boolean power; //전원상태
	int channel; //채널
	
	void power() {power = !power; }
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	   
}

class CaptionTv extends Tv2{ 
	boolean caption;	//캡션 상태(on/off)
	void displayCaption(String text) {
		if(caption) {	//캡션 상태사 on(true)일 때만 text를 보여 줌
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;	//캡션(자막) 기능을 켬
		ctv.displayCaption("Hello, World");
	}

}