package game;
public class DieTest {

	public static void main(String[] args) {
		Die die = new Die();
		int value = die.roll();
		die.setValue(value);
		System.out.println(die.toString());
	}

}
