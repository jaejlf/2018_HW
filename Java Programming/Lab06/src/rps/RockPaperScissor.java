package rps;

import java.util.*;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("����(0), ����(1), ��(2): ");
		
		int user = input.nextInt();
		int computer = random.nextInt(3);
		
		if(user == computer) System.out.println("�ΰ��� ��ǻ�Ͱ� �����");
		else if(user == (computer + 1) % 3) {
			System.out.println("�ΰ� : " + user + " ��ǻ�� : " + computer + "    �ΰ� �¸�");
		}
		else {
			System.out.println("�ΰ� : " + user + " ��ǻ�� : " + computer + "    ��ǻ�� �¸�");			
		}
		
	input.close();
	
	}

}
