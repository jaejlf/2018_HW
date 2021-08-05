
public class Buyer {
	private int money; //초기 자금
	
	public Buyer(int money) {
		this.money = money;
	}
	
	//Food
	public void buy(Food item, int count) {
		System.out.println(item.toString() + count +"개 구매");
		
		if(money < item.price * count) System.out.println("잔액 부족 : " + money);
		else {
			money -= item.price * count;
			System.out.println("구매 완료 후 잔액 : " + money);
		}
	}
	
	//Book2
	public void buy(Book2 item, int count) {
		System.out.println(item.toString() + count +"개 구매");
		if(money < item.price * count) System.out.println("잔액 부족 : " + money);
		else {
			money -= item.price * count;
			System.out.println("구매 완료 후 잔액 : " + money);
		}
	}
	
	//Movie
	public void buy(Movie item, int count) {
		System.out.println(item.toString() + count +"개 구매");
		if(money < item.price * count) System.out.println("잔액 부족 : " + money);
		else {
			money -= item.price * count;
			System.out.println("구매 완료 후 잔액 : " + money);
		}
	}
	
}
