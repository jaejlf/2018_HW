import java.io.BufferedReader;
import java.io.FileReader;

public class PhoneOpen {
	public static void main(String[] args) {
		
		System.out.println("=== ��ȭ��ȣ ��� ���α׷��Դϴ� === ");
		System.out.println("info.txt�� ����մϴ�.");
		
		try(BufferedReader in = new BufferedReader(new FileReader("info.txt"));) {
			
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(Exception e) {
		}
	}
}
