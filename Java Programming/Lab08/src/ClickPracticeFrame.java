import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ClickPracticeFrame extends JFrame {
	JLabel label, label1, label2, label3, label4;
	JPanel panel;
	
	Random random = new Random();
	
	public ClickPracticeFrame() {
		setTitle("클릭 연습용 응용프로그램");
		setSize(400,400);
		setLayout(null);
		
		label = new JLabel("C");
		label.setBounds(100, 100, 20, 20);
				
		label.requestFocus();		
		label.setFocusable(true);	
		
		//Click!
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = random.nextInt(getContentPane().getWidth() - 20);
				int y = random.nextInt(getContentPane().getHeight() - 20);
				label.setLocation(x, y);
			}
		});

		add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		ClickPracticeFrame f = new ClickPracticeFrame();
	}

}
