import java.awt.*;
import javax.swing.*;

public class ColorFontTest extends JFrame{
	JLabel l1, l2, l3, l4;
	Font f1, f2, f3, f4;
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
		
			g.setFont(f1);
			g.setColor(Color.blue);
			g.drawString("����: ���ѹα�(�ü���Ʈ)", 20, 30);
			
			g.setFont(f2);
			g.setColor(Color.red);
			g.drawString("�ּ�: ����� ������(���� ��Ʈ)", 20, 65);
			
			g.setFont(f3);
			g.setColor(Color.orange);
			g.drawString("����: ������(�޸ո���ü ��Ʈ)", 20, 100);
			
			g.setFont(f4);
			g.setColor(Color.gray);
			g.drawString("�й�: 1814798(���� ��Ʈ)", 20, 150);
			
		}
	}
	
	public ColorFontTest() {
		setTitle("Color, Font ��� ����");
		setSize(500, 230);
		
		//��Ʈ ����
		f1 = new Font("�ü�", Font.PLAIN, 20);
		f2 = new Font("����", Font.PLAIN, 20);
		f3 = new Font("�޸ո���ü", Font.PLAIN, 20);
		f4 = new Font("����", Font.PLAIN, 15);
				
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ColorFontTest f = new ColorFontTest();
	}

}
