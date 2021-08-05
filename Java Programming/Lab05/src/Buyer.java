
public class Buyer {
	private int money; //�ʱ� �ڱ�
	
	public Buyer(int money) {
		this.money = money;
	}
	
	//Food
	public void buy(Food item, int count) {
		System.out.println(item.toString() + count +"�� ����");
		
		if(money < item.price * count) System.out.println("�ܾ� ���� : " + money);
		else {
			money -= item.price * count;
			System.out.println("���� �Ϸ� �� �ܾ� : " + money);
		}
	}
	
	//Book2
	public void buy(Book2 item, int count) {
		System.out.println(item.toString() + count +"�� ����");
		if(money < item.price * count) System.out.println("�ܾ� ���� : " + money);
		else {
			money -= item.price * count;
			System.out.println("���� �Ϸ� �� �ܾ� : " + money);
		}
	}
	
	//Movie
	public void buy(Movie item, int count) {
		System.out.println(item.toString() + count +"�� ����");
		if(money < item.price * count) System.out.println("�ܾ� ���� : " + money);
		else {
			money -= item.price * count;
			System.out.println("���� �Ϸ� �� �ܾ� : " + money);
		}
	}
	
}
