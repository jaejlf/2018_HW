import java.util.Scanner;

public class Lab2_5 {

	public static void main(String[] args) {
		
		int f1 = 0;
		int f2 = 1;
		int f = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력할 항의 개수 : ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			if(i == 0) {
				System.out.print(0 + " ");
			} else if(i == 1) {
				System.out.print(1 + " ");
			}else {
				f = f1 + f2;
				System.out.print(f + " ");
				f1 = f2;
				f2 = f;
			}
			
		}
		input.close();

	}
	

}
