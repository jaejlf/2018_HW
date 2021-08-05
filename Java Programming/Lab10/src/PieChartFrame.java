import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PieChartFrame extends JFrame implements ActionListener{
	JPanel p1;
	JLabel l1, l2, l3, l4;
	Font f1;
	JTextField t1, t2, t3, t4;
	String[] fruit = { "apple", "cherry", "strawberry", "prune" };
	double total;
	double x, y, z, r;
	int in = 0;
	int r1, r2, r3, r4;
	
	class Slice{
		double value;
		Color color;
		public Slice(double value, Color color) {
			this.value = value;
			this.color = color;
		}
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//action 발생 후
			Slice[] list = { new Slice(x, Color.red), new Slice(y, Color.blue),
					new Slice(z, Color.magenta), new Slice(r, Color.orange) };
			if(in == 1) {
				//현재값, draw
				double current = 0;
				int start = 0;
				for(int i = 0; i < list.length; i++) {
					start = (int)Math.round(current * 360 / total);
					int angle = (int)Math.round(list[i].value * 360 / total);
					g.setColor(list[i].color);
					g.fillArc(150, 50, 200, 200, start, angle);
					current += list[i].value;
				}
				
				r1 = (int)Math.round(x/total*100);
				r2 = (int)Math.round(y/total*100);
				r3 = (int)Math.round(z/total*100);
				r4 = (int)Math.round(r/total*100);
				
				//결과 텍스트 출력
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString(fruit[0] + " " + r1 + "%", 50, 30);
				
				g.setFont(f1);
				g.setColor(Color.blue);
				g.drawString(fruit[1] + " " + r2 + "%", 150, 30);
				
				g.setFont(f1);
				g.setColor(Color.magenta);
				g.drawString(fruit[2] + " " + r3 + "%", 250, 30);
				
				g.setFont(f1);
				g.setColor(Color.orange);
				g.drawString(fruit[3] + " " + r4 + "%", 370, 30);
			}
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		in = 1; //action 발생
		x = Double.parseDouble(t1.getText());
		y = Double.parseDouble(t2.getText());
		z = Double.parseDouble(t3.getText());
		r = Double.parseDouble(t4.getText());
		
		total = x + y + z + r;
		repaint();
	}

	
	public PieChartFrame() {
		setTitle("파이 차트 그리기");
		setSize(500, 350);
		
		p1 = new JPanel(new FlowLayout());
		p1.setBackground(Color.gray);
		
		//라벨
		l1 = new JLabel(fruit[0]);
		l2 = new JLabel(fruit[1]);
		l3 = new JLabel(fruit[2]);
		l4 = new JLabel(fruit[3]);
		
		//텍스트
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		t3 = new JTextField(5);
		t4 = new JTextField(5);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		
		//폰트
		f1 = new Font("굴림", Font.PLAIN, 13);
		
		p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3); p1.add(l4); p1.add(t4);
		
		add(p1, BorderLayout.NORTH);
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PieChartFrame f = new PieChartFrame();
	}
}
