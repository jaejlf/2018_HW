import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EncryptTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String infile;
		String outfile;
		
		byte value;
		byte key = 17;
		
		System.out.print("원본 파일 이름을 입력하시오 : ");
		infile = input.nextLine();
		System.out.print("암호 파일 이름을 입력하시오 : ");
		outfile = input.nextLine();
		
		
		try(FileInputStream in = new FileInputStream(infile);
				FileOutputStream out = new FileOutputStream(outfile)) {
		
			int c;
			while((c = in.read()) != -1) {
				value = (byte) in.read();
				value = (byte) (value^key);
				
				out.write(value);
			}
		} catch(Exception e) {
		}	
	}
}
