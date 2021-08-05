import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		setTitle("BorderLayout Practice");
		setSize(400,200);
		setLayout(new BorderLayout(5, 7));
	
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		setVisible(true);	
		
		
	}

	public static void main(String[] args) {
		BorderLayoutTest f = new BorderLayoutTest();

	}

}
