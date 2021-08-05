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
		
		//값 초기화
		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}
		
		System.out.print("스레드 수 : ");
		int n = scan.nextInt();
		ThreadTest[] t = new ThreadTest[n];
		
		//스레드 객체 생성
		int s = 0;
		int jump = 100/n - 1;
		int e = s + jump;
		
		//스레드수 100으로 나눠떨어질 때
		if(100 % n == 0) {
			for(int i = 0; i < n; i++) {
				t[i] = new ThreadTest(testArray, s, e);
				t[i].start();
				s = e + 1;
				e = s + jump;
			}
		}
		//아닐 때
		else {
			int i = 0;
			for(i = 0; i < n - 1; i++) {
				t[i] = new ThreadTest(testArray, s, e);
				t[i].start();
				s = e + 1;
				e = s + jump;
				
			}
			//마지막 스레드
			t[i] = new ThreadTest(testArray, s, e + 100%n);
		}
		
		for(int i = 0; i < n; i++) {
			t[i].join();
			System.out.println("Thread[" + i + "]의 합 : " + t[i].sum);
			sum += t[i].sum;
		}
		System.out.println("총 합계 : " + sum);
	}

}
