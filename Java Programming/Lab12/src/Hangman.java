import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String solution = null;
		StringBuffer answer = null;
		int count = 0;
		int linenum = 0;
		String line;
		
		//�ܾ��� ���� ����
		try(BufferedReader in = new BufferedReader(new FileReader("words.txt"))) {
			
			while((line = in.readLine()) != null) {
				linenum++;
			}
		} catch(Exception e) {
		}
		
		//solution ���ϱ�
		try(BufferedReader in = new BufferedReader(new FileReader("words.txt"))){
			
			int index = (new Random()).nextInt(linenum) + 1;
			int n = 1;
			
			while((line = in.readLine()) != null) {
				if(n == index) {
					solution = line;
					answer = new StringBuffer(solution.length()); 
					count = solution.length();
					break;
				}
				n++;
			}
		} catch(Exception e) {
		}
		
		//game
		for(int i = 0; i < count; i++) {
			answer.append("_");
		}

		do {
			System.out.print("������ ����: ");			
			System.out.println(answer);
			
			if(count == 0) break; //��������

			System.out.print("���ڸ� �����Ͻÿ�: ");
			String s = input.nextLine();
			char userword = s.charAt(0); //user�� �Է��� ����

			for(int i = 0; i < solution.length(); i++) {
				char cmp = solution.charAt(i); 
				char change = answer.charAt(i);
				
				//���ڸ� ��������
				if(cmp == userword && change == '_') {
					answer.setCharAt(i, cmp);
					count--;
					break;
				}
			}
					
		} while(true);
	}
}
