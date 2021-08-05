import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRainfall {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num;
		int sum = 0;
		
		while(true) {
			System.out.print("강수량 입력 (0 입력 시 종료)>> ");
			num = input.nextInt();
			
			if(num != 0) {
				list.add(num);
				sum += num;
				System.out.println(list.toString());
				
				int size = list.size();
				System.out.println("현재 평균 : " + sum/size);
			}
			else break;
		}
		
	}

}
