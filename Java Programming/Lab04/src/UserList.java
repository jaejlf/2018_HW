import java.util.*;

class User{
	private String userId, password;
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	String getId() { return userId; }
	String getPass() { return password; }
}
public class UserList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<User> user = new ArrayList<>();
				
		while(true) {
			System.out.println("========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("========================");
			
			System.out.print("번호 입력 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			if(num >=1 || num <=4) {
				switch(num) {
					case 1:
						System.out.print("ID : ");
						String id = scan.nextLine();
						System.out.print("PASSWORD : ");
						String pw = scan.nextLine();
						
						user.add(new User(id, pw));
						break;
					case 2:
						System.out.print("ID : ");
						String tmp_id = scan.nextLine();						
						System.out.print("PASSWORD : ");
						String tmp_pw = scan.nextLine();
						
						int check = 1; // true = 0, false = 1
						for(User obj : user) {
							if(tmp_id.equals(obj.getId())) {
								if(tmp_pw.equals(obj.getPass())) {
									check = 0;
									break;
								} else break;
							}
						}
						if(check ==  1) System.out.println("로그인 실패");
						else System.out.println("로그인 성공");
						break;
					case 3:
						for(User obj : user)
							System.out.println("{" + obj.getId()  + "," + obj.getPass() + "}");
						break;
					case 4:
						break;
				}
			}
			else continue;
						
			if(num == 4) {
				System.out.println("종료");
				break;
			}
		}
		scan.close();
	}
}
