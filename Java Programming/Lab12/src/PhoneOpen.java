import java.io.BufferedReader;
import java.io.FileReader;

public class PhoneOpen {
	public static void main(String[] args) {
		
		System.out.println("=== 전화번호 출력 프로그램입니다 === ");
		System.out.println("info.txt를 출력합니다.");
		
		try(BufferedReader in = new BufferedReader(new FileReader("info.txt"));) {
			
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(Exception e) {
		}
	}
}
