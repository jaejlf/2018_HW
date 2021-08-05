import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class PhoneSave {
	public static void main(String[] args) {
		String name;
		String phone;
		String line;
		
		System.out.println("=== 전화번호 입력 프로그램입니다 === ");
		Scanner input = new Scanner(System.in);
		
		try(BufferedWriter in = new BufferedWriter(new FileWriter("info.txt"));){
			
			while(true) {
				System.out.print("이름 전화번호 >> ");
				name = input.next();
				if(name.equals("그만")) break;
				else {
					phone = input.nextLine();
					line = name.concat(phone + "\n");
					in.write(line);
				}
			}
			
			System.out.println("info.txt에 저장하였습니다.");
		} catch(Exception e) {
		}

		input.close();
	}
}
