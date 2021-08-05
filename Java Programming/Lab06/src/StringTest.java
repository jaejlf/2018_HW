import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String s = input.nextLine();
		String[] tokens = s.split(" ");
		
		for (String token : tokens) {
			System.out.print(token + ",");
			count++;
		}
		System.out.println("");
		System.out.println("모두 "+ count + "개의 단어가 있습니다.");

		input.close();
	}

}
