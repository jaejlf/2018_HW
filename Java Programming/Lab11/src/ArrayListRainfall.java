import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRainfall {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num;
		int sum = 0;
		
		while(true) {
			System.out.print("������ �Է� (0 �Է� �� ����)>> ");
			num = input.nextInt();
			
			if(num != 0) {
				list.add(num);
				sum += num;
				System.out.println(list.toString());
				
				int size = list.size();
				System.out.println("���� ��� : " + sum/size);
			}
			else break;
		}
		
	}

}
