import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficTest extends JFrame implements ActionListener{
	JButton but;
	int num = 0;

	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			
			g.drawOval(60, 50, 100, 100);
			g.drawOval(60, 150, 100, 100);
			g.drawOval(60, 250, 100, 100);
			
			if(num == 0) {
				g.setColor(Color.red);
				g.fillOval(60, 50, 100, 100);
			}
			else if(num == 1) {
				g.setColor(Color.green);
				g.fillOval(60, 150, 100, 100);
			}
			else {
				g.setColor(Color.orange);
				g.fillOval(60, 250, 100, 100);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		num++;
		if(num >= 3) num = 0;
		repaint();
	}

	
	public TrafficTest() {
		setTitle("신호등");
		setSize(250, 500);
		
		but = new JButton("신호 변경");
		but.addActionListener(this);
		
		add(new MyPanel());
		add(but, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		TrafficTest f = new TrafficTest();
	}
}
