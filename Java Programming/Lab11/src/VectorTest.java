import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		int num;

		//�Է¹ޱ�
		Scanner input = new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>> ");
		while(true) {
			num = input.nextInt();
			
			if(num != -1) {
				list.add(num);
			}
			else break;
		}
		
		//�Է� �� ���
		int size = list.size();
		System.out.print("���� �� : ");
		System.out.println(list.toString());
		
//		System.out.print("���� �� : [");
//		for(int i = 0; i < size-1; i++) {
//			System.out.print(list.get(i) + ", ");
//		}
//		System.out.print(list.get(size-1));
//		System.out.println("]");

		//���� ū ��
		int max = 0;
		for(int i = 0; i < size - 1; i++) {
			if(list.get(max) < list.get(i+1)) {
				max = i+1;

			}
		}
		
		System.out.println("���� ū �� <" + list.get(max) + "> ����");
		list.remove(max);
		size = list.size();
		
		System.out.print("���� �� : ");
		System.out.println(list.toString());

		
		//���� ���� ��
		int min = 0;
		for(int i = 0; i < size - 1; i++) { 
			if(list.get(min) > list.get(i+1)) {
				min = i+1;
			}
		}
		
		System.out.println("���� ���� �� <" + list.get(min) + "> ����");
		list.remove(min);
		size = list.size();
		
		System.out.print("���� �� : ");
		System.out.println(list.toString());
	}

}


