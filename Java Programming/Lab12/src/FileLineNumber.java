import java.io.BufferedReader;
import java.io.FileReader;

public class FileLineNumber {

	public static void main(String[] args) {
		
		System.out.println("c\\windows\\system.ini ������ �о� ����մϴ�.");
		try(BufferedReader in = new BufferedReader(new FileReader("c:\\windows\\system.ini"));) {
				
			String line;
			int linenum = 1;
			
			while((line = in.readLine()) != null) {
				System.out.printf("   %d:  ", linenum);
				System.out.println(line);
				linenum++;
			}
		} catch(Exception e) {
		}
	}

	
}
