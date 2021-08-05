import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Human[] human;
		human = new Human[3];
		
		Student[] student;
		student = new Student[3];
		
		Scanner scan = new Scanner(System.in);
		
		//Human
		for(int i = 1; i <= 3; i++) {
			System.out.print("[" + i + "] Human 입력:");
			String n = scan.next();
			int a = scan.nextInt();
			human[i-1] = new Human(n, a);
		}
		
		//Student
		for(int i = 1; i <= 3; i++) {
			System.out.print("[" + i + "] Student 입력:");
			String s_n = scan.next();
			int s_a = scan.nextInt();
			String s_m = scan.next();
			String s_sid = scan.nextLine();
			student[i-1] = new Student(s_n, s_a, s_m, s_sid);
		}
		
		for(Human obj : human) {
			System.out.println(obj.toString());
		}
		for(Student obj : student) {
			System.out.println(obj.toString());
		}
		scan.close();
	}
}
