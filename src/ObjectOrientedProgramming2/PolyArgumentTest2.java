package ObjectOrientedProgramming2;


class Product2 {
	int price ; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){}//기본생성자
}

class TvProduct2 extends Product2{
	TvProduct2() { super(100); }
	public String toString() {return "TvProduct2";}
}

class ComputerProduct2 extends Product2{
	ComputerProduct2() { super(200); }
	public String toString() {return "ComputerProduct2";}
}


class AudioProduct2 extends Product2{
	AudioProduct2() { super(50); }
	public String toString() {return "AudioProduct2";}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0; 
	Product2[] item = new Product2[10]; //구입한 제품을 저장하기 위한 배열
	int i=0;
	
	void buyProduct(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String result = "";
		
		for(int idx=0; idx<item.length; idx++) {
			if(item[idx] == null) {
				break;
			}
			sum++;
			//result+=item[idx] +", ";
			result+= (idx==0)?""+item[idx]:", "+item[idx];
		}
		
		System.out.println("현재까지 구매한 아이템의 개수는 "+sum+"입니다.");
		System.out.println("현재까지 구매한 아이템은 "+result+"입니다.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		Product2 computerProduct = new ComputerProduct2();
		Product2 audioProduct = new AudioProduct2();
		buyer.buyProduct(computerProduct);
		buyer.buyProduct(audioProduct);
		
		buyer.summary();
	}
}

