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
		
		//단어의 개수 세기
		try(BufferedReader in = new BufferedReader(new FileReader("words.txt"))) {
			
			while((line = in.readLine()) != null) {
				linenum++;
			}
		} catch(Exception e) {
		}
		
		//solution 정하기
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
			System.out.print("현재의 상태: ");			
			System.out.println(answer);
			
			if(count == 0) break; //종료조건

			System.out.print("글자를 추측하시오: ");
			String s = input.nextLine();
			char userword = s.charAt(0); //user가 입력한 글자

			for(int i = 0; i < solution.length(); i++) {
				char cmp = solution.charAt(i); 
				char change = answer.charAt(i);
				
				//글자를 맞췄으면
				if(cmp == userword && change == '_') {
					answer.setCharAt(i, cmp);
					count--;
					break;
				}
			}
					
		} while(true);
	}
}
