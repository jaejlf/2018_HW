import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class PhoneSave {
	public static void main(String[] args) {
		String name;
		String phone;
		String line;
		
		System.out.println("=== ��ȭ��ȣ �Է� ���α׷��Դϴ� === ");
		Scanner input = new Scanner(System.in);
		
		try(BufferedWriter in = new BufferedWriter(new FileWriter("info.txt"));){
			
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				name = input.next();
				if(name.equals("�׸�")) break;
				else {
					phone = input.nextLine();
					line = name.concat(phone + "\n");
					in.write(line);
				}
			}
			
			System.out.println("info.txt�� �����Ͽ����ϴ�.");
		} catch(Exception e) {
		}

		input.close();
	}
}
