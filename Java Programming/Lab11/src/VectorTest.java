import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		int num;

		//입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			num = input.nextInt();
			
			if(num != -1) {
				list.add(num);
			}
			else break;
		}
		
		//입력 후 출력
		int size = list.size();
		System.out.print("삭제 전 : ");
		System.out.println(list.toString());
		
//		System.out.print("삭제 전 : [");
//		for(int i = 0; i < size-1; i++) {
//			System.out.print(list.get(i) + ", ");
//		}
//		System.out.print(list.get(size-1));
//		System.out.println("]");

		//가장 큰 수
		int max = 0;
		for(int i = 0; i < size - 1; i++) {
			if(list.get(max) < list.get(i+1)) {
				max = i+1;

			}
		}
		
		System.out.println("가장 큰 수 <" + list.get(max) + "> 삭제");
		list.remove(max);
		size = list.size();
		
		System.out.print("삭제 후 : ");
		System.out.println(list.toString());

		
		//가장 작은 수
		int min = 0;
		for(int i = 0; i < size - 1; i++) { 
			if(list.get(min) > list.get(i+1)) {
				min = i+1;
			}
		}
		
		System.out.println("가장 작은 수 <" + list.get(min) + "> 삭제");
		list.remove(min);
		size = list.size();
		
		System.out.print("삭제 후 : ");
		System.out.println(list.toString());
	}

}


