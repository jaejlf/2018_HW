import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame{
	public GuiTest() {
		setTitle("GuiTest");
		setSize(330,170);
		
		JPanel panel = new JPanel(new GridLayout(0,1));
		
		JPanel p1 = new JPanel(new BorderLayout(20,20));
		p1.add(new JLabel("��    ��"), BorderLayout.WEST);
		p1.add(new JTextField(50), BorderLayout.CENTER);
		
	
		JPanel p2 = new JPanel(new BorderLayout(20,20));
		p2.add(new JLabel("��    ��"), BorderLayout.WEST);
		p2.add(new JTextField(20), BorderLayout.CENTER);
		
		JPanel p3 = new JPanel(new BorderLayout(20,20));
		p3.add(new JLabel("��    ��"), BorderLayout.WEST);
		p3.add(new JTextField("��ǻ�Ͱ�������", 20), BorderLayout.CENTER);
		
		JPanel p4 = new JPanel(new BorderLayout(20,20));
		p4.add(new JLabel("����ó"), BorderLayout.WEST);
		p4.add(new JTextField(20), BorderLayout.CENTER);
		
		JPanel p5 = new JPanel(new FlowLayout());
		p5.add(new JButton("Ȯ��"));
		p5.add(new JButton("���"));
	
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		
		add(panel);
		add(p5, BorderLayout.SOUTH);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		GuiTest f = new GuiTest();
		
	}

}
