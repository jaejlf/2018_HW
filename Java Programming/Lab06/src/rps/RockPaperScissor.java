package rps;

import java.util.*;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		
		int user = input.nextInt();
		int computer = random.nextInt(3);
		
		if(user == computer) System.out.println("인간과 컴퓨터가 비겼음");
		else if(user == (computer + 1) % 3) {
			System.out.println("인간 : " + user + " 컴퓨터 : " + computer + "    인간 승리");
		}
		else {
			System.out.println("인간 : " + user + " 컴퓨터 : " + computer + "    컴퓨터 승리");			
		}
		
	input.close();
	
	}

}
