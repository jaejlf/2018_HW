package game;

import java.util.Random;

public class Die {
	int value;
	
	public Die() {
		value = 1;
	}
	
	//주사위 던지기
	int roll() {
		Random random = new Random();
		int ran_val = random.nextInt(6) + 1;
		return ran_val;	
	}

	public int getValue() { return value; }

	public void setValue(int v) { value = v; }
	
	public String toString() {
		return "현재 주사위 상태: " + getValue();
	}
}
