package ObjectOrientedProgramming2;

class Product{
	int price;
	int bonus;
	
	Product(){
		this(0,0);
	}

	Product(int price){
		this(price,1);
	}
	
	Product(int price, int bonus){
		this.price = price;
		this.bonus = bonus;
	}
}

class TvProduct extends Product{
	TvProduct(){
		super(20);
		System.out.println("TvProduct의 가격은 "+price +"입니다");
	}
}

class ComputerProduct extends Product{

	ComputerProduct(){
		super(10);
		System.out.println("ComputerProduct의 가격은 "+price +"입니다");
	}
	
	public String toString(){
		return "ComputerProduct";
	}
}

class AudioProduct extends Product{
	AudioProduct(){
		super(5);
		System.out.println("TvProduct의 가격은 "+price +"입니다");
	}
	public String toString(){
		return "AudioProduct";
	}
}

class Buyer{
	int money;
	int bonus;
	Product[] productArr = new Product[100];
	int itemIdx;
	
	Buyer(){
		this(1000,10);
	}
	
	Buyer(int money, int bonus){
		this.money = money;
		this.bonus = bonus;
	}
	
	void buyProduct(Product p) {
		
		if(money >= p.price) {
			money -= p.price;			
			bonus += p.bonus;
			productArr[itemIdx] = p;
			System.out.println("물건을 구입하였습니다. 제품 금액(price)은 "+p.price);
			System.out.println("물건을 구입하였습니다. 현재 잔액(money)은 "+money);
			System.out.println("물건을 구입하였습니다. 구입한 제품은 "+ productArr[itemIdx]);
		    itemIdx++;
		} else {
			System.out.println("가지고 있는 돈이 모자라서 구입할 수 없습니다.");
		}
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		Product computerProduct = new ComputerProduct();
		Product audioProduct = new AudioProduct();
		buyer.buyProduct(computerProduct);
		buyer.buyProduct(audioProduct);
		
		for(int i=0; i<buyer.productArr.length; i++) {
			System.out.println(buyer.productArr[i]);
		}
	}
}
