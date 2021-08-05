class Dice{
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	void roll() { value = (int)(Math.random() * 6) + 1; }
	
	int getValue() { return value; }
	
}
public class DiceTest {

	public static void main(String[] args) {
		
		Dice a = new Dice();
		Dice b = new Dice();
		
		int count = 0;
		do {
			a.roll();
			b.roll();
			count++;
			
			System.out.println("주사위1 = " + a.getValue() + " 주사위2 = " + b.getValue());
		} while(a.getValue() + b.getValue() != 2);
		
		System.out.println("(1,1)이 나오는데 걸린 횟수 = " + count);
		

	}

}
