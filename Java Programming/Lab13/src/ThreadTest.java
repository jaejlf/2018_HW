import java.util.Scanner;

public class ThreadTest extends Thread {
	int[] myArray;
	int start, end;
	int sum = 0;
	
	ThreadTest(int[] a, int s, int e){
		
		myArray = new int[e-s + 1];
	
		for(int i = 0; i < e-s + 1; i++) {
			myArray[i] = i + s;
		}
		start = s;
		end = e;
	}
	
	public void run() {
		for(int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		int[] testArray = new int[100];
		int sum = 0;
		
		//�� �ʱ�ȭ
		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}
		
		System.out.print("������ �� : ");
		int n = scan.nextInt();
		ThreadTest[] t = new ThreadTest[n];
		
		//������ ��ü ����
		int s = 0;
		int jump = 100/n - 1;
		int e = s + jump;
		
		//������� 100���� ���������� ��
		if(100 % n == 0) {
			for(int i = 0; i < n; i++) {
				t[i] = new ThreadTest(testArray, s, e);
				t[i].start();
				s = e + 1;
				e = s + jump;
			}
		}
		//�ƴ� ��
		else {
			int i = 0;
			for(i = 0; i < n - 1; i++) {
				t[i] = new ThreadTest(testArray, s, e);
				t[i].start();
				s = e + 1;
				e = s + jump;
				
			}
			//������ ������
			t[i] = new ThreadTest(testArray, s, e + 100%n);
		}
		
		for(int i = 0; i < n; i++) {
			t[i].join();
			System.out.println("Thread[" + i + "]�� �� : " + t[i].sum);
			sum += t[i].sum;
		}
		System.out.println("�� �հ� : " + sum);
	}

}
