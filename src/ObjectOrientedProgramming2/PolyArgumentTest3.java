package ObjectOrientedProgramming2;

import java.util.Vector;

class Product3 {
	int price ; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product3(){}//기본생성자
}

class TvProduct3 extends Product3{
	TvProduct3() { super(100); }
	public String toString() {return "TvProduct3";}
}

class ComputerProduct3 extends Product3{
	ComputerProduct3() { super(200); }
	public String toString() {return "ComputerProduct3";}
}


class AudioProduct3 extends Product3{
	AudioProduct3() { super(50); }
	public String toString() {return "AudioProduct3";}
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0; 
	//Product3[] item = new Product3[10]; //구입한 제품을 저장하기 위한 배열
	Vector item = new Vector();//구입한 제품을 저장하기 위한 Vector객체
	int i=0;
	
	void buyProduct(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void refund(Product3 p) {
		boolean findItem = false;
		for(int idx=0; idx<item.size(); idx++) {
			if(item.get(idx) == p) {
				item.remove(idx);
				findItem=true;
				break;
			}
		}
		if(findItem) {
			money += p.price;
			bonusPoint -= p.bonusPoint;			
			System.out.println("환불되었습니다. 현재 잔액은 "+money+"입니다.");
		}else {
			System.out.println("구입하신 적이 없는 제품입니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String result = "";
		
		for(int idx=0; idx<item.size(); idx++) {
			if(item.get(i) == null) {
				break;
			}
			sum++;
			//result+=item[idx] +", ";
			result+= (idx==0)?""+item.get(idx):", "+item.get(idx);
		}
		
		System.out.println("현재까지 구매한 아이템의 개수는 "+sum+"입니다.");
		System.out.println("현재까지 구매한 아이템은 "+result+"입니다.");
	}
}

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer3 buyer = new Buyer3();
		Product3 tvProduct = new TvProduct3();
		Product3 computerProduct = new ComputerProduct3();
		Product3 audioProduct = new AudioProduct3();
		buyer.buyProduct(computerProduct);
		buyer.buyProduct(audioProduct);
		
		buyer.refund(tvProduct);
		buyer.summary();
	}
}

