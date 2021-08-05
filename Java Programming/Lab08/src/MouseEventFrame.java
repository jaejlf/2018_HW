import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseEventFrame extends JFrame{
	JLabel label;
	JPanel panel;
	
	public MouseEventFrame() {
		setTitle("���콺 �ø��� ������");
		setSize(400,200);
		
		panel = new JPanel(new FlowLayout());
		
		label = new JLabel("Love Java");
		panel.add(label);
			
		add(panel);
	
//		label.requestFocus();		
//		label.setFocusable(true);	
				
		//Mouse KeyAdaptor
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("Love Java");
			}
			
			public void mouseExited(MouseEvent e) {
				label.setText("�����");
			}
		});
		
		setVisible(true);

		
	}
	public static void main(String[] args) {
		MouseEventFrame f = new MouseEventFrame();
	}

}
