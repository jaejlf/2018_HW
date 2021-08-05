import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CustomerManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Integer> list = new HashMap<>();
		String name;
		int point;
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			name = input.next();
			
			if(name.equals("그만")) break;
			else {
				point = input.nextInt();
				for(Map.Entry<String, Integer> s : list.entrySet()) {
					if(name.equals(s.getKey())) {
						point += s.getValue();
					}
				}
				list.put(name, point);
				System.out.println(list.toString());
				
			}
		}
	}

}
