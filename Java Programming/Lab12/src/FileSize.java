import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		
		long max = 0;
		String maxname = "";
		
		File f = new File("c:\\");
		File[] subfiles = f.listFiles();
		
		for(int i = 0; i < subfiles.length; i++) {
			if(max < subfiles[i].length()) {
				max = subfiles[i].length();
				maxname = subfiles[i].getName();
			}
		}
		
		System.out.println("���� ū ������ c:\\ " + maxname + " " + max + "����Ʈ");	

	}
}
