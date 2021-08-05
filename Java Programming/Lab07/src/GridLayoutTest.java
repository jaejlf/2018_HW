import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame {
	
	Color[] c = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, 
			Color.blue, Color.magenta, Color.lightGray, Color.pink, Color.gray};
	String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	public GridLayoutTest() {
		setTitle("Ten Buttons Frame");
		setSize(500, 300);
		setLayout(new GridLayout());
		
		for(int i = 0; i < 10; i++) {
			add(new JButton(num[i])).setBackground(c[i]);
		}
		
		setVisible(true);	
			
	}

	public static void main(String[] args) {
		GridLayoutTest f = new GridLayoutTest();
	}

}
