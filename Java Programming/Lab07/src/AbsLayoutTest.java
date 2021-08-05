import java.awt.*;
import javax.swing.*;

public class AbsLayoutTest extends JFrame {
	
	String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
	
	public AbsLayoutTest() {
		setTitle("Random Labels");
		setLocation(20,20);
		setSize(300, 300);
		
		setLayout(null);
	
		for(int i = 0; i < 20; i++) {
			int x = (int)(Math.random()*200) + 30;
			int y = (int)(Math.random()*200) + 30;
			
			JLabel b = new JLabel(num[i]);
			b.setBackground(Color.cyan);
			b.setLocation(x,y);
			b.setSize(15,15);
			b.setOpaque(true);
			add(b);
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		AbsLayoutTest f = new AbsLayoutTest();

	}

}
