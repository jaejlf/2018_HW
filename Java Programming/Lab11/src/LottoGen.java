import java.util.ArrayList;
import java.util.HashSet;

public class LottoGen {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int num;
		int count = 0;
		
		while(true) {
			num = (int)(Math.random()*45 + 1);
			
			if(!set.contains(num)) {
				set.add(num);
				count++;
			}
			
			if(count == 6) break;
		}
		System.out.print("Lotto [set = ");
		System.out.print(set.toString());
		System.out.print("]");
	}

}
