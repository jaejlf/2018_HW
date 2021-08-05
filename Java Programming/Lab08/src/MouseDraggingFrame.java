import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseDraggingFrame extends JFrame{
	JPanel panel;
	
	public MouseDraggingFrame() {
		setTitle("µå·¡±ë µ¿¾È YELLO");
		setSize(400,250);
				
		panel = new JPanel();
		panel.setBackground(Color.green);
		
//		panel.requestFocus();		
//		panel.setFocusable(true);	
		
		panel.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(Color.green);
			}
			
		});
		
		panel.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				panel.setBackground(Color.yellow);
			}
			
		});
		

		add(panel);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		MouseDraggingFrame f = new MouseDraggingFrame();		
	}

}
