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
			g.drawString("국적: 대한민국(궁서폰트)", 20, 30);
			
			g.setFont(f2);
			g.setColor(Color.red);
			g.drawString("주소: 서울시 마포구(바탕 폰트)", 20, 65);
			
			g.setFont(f3);
			g.setColor(Color.orange);
			g.drawString("성명: 손재정(휴먼매직체 폰트)", 20, 100);
			
			g.setFont(f4);
			g.setColor(Color.gray);
			g.drawString("학번: 1814798(굴림 폰트)", 20, 150);
			
		}
	}
	
	public ColorFontTest() {
		setTitle("Color, Font 사용 예제");
		setSize(500, 230);
		
		//폰트 설정
		f1 = new Font("궁서", Font.PLAIN, 20);
		f2 = new Font("바탕", Font.PLAIN, 20);
		f3 = new Font("휴먼매직체", Font.PLAIN, 20);
		f4 = new Font("굴림", Font.PLAIN, 15);
				
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ColorFontTest f = new ColorFontTest();
	}

}
