import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String s = input.nextLine();
		String[] tokens = s.split(" ");
		
		for (String token : tokens) {
			System.out.print(token + ",");
			count++;
		}
		System.out.println("");
		System.out.println("��� "+ count + "���� �ܾ �ֽ��ϴ�.");

		input.close();
	}

}
