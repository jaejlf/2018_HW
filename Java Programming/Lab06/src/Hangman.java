import java.util.*;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = {"java", "count", "school", "book", "student", "programmer"};
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index]; //solution : 정답 문자열
		StringBuffer answer = new StringBuffer(solution.length()); 
		int count = solution.length();
		
		for(int i = 0; i < solution.length(); i++) {
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

		input.close();
	}

}
