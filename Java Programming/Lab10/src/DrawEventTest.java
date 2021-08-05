import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class DrawEventTest extends JFrame{
	int x, y, z, r;
	Vector<Circle> list = new Vector<>();
	
	class Circle{
		int x, y, z, r;
		public Circle(int x, int y, int z, int r) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.r = r;
		}
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				
				@Override
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					z = e.getX() - x;
					r = e.getY() - y;
					list.add(new Circle(x, y, z, r));
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(Circle c : list) {
				g.setColor(Color.red);
				g.drawOval(c.x, c.y, c.z, c.r);
			}
		}
	}

	public DrawEventTest() {
		setTitle("원 그리기 이벤트");
		setSize(400, 400);
		add(new MyPanel());		
		setVisible(true);
	}
		
	public static void main(String[] args) {
		DrawEventTest f = new DrawEventTest();
	}
}
