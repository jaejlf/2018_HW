import java.util.*;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = {"java", "count", "school", "book", "student", "programmer"};
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index]; //solution : ���� ���ڿ�
		StringBuffer answer = new StringBuffer(solution.length()); 
		int count = solution.length();
		
		for(int i = 0; i < solution.length(); i++) {
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

		input.close();
	}

}
