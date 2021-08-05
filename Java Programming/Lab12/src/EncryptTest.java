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
		
		System.out.print("���� ���� �̸��� �Է��Ͻÿ� : ");
		infile = input.nextLine();
		System.out.print("��ȣ ���� �̸��� �Է��Ͻÿ� : ");
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
