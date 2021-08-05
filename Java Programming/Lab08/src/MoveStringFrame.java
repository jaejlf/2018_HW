import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MoveStringFrame extends JFrame{
	JLabel label;
	JPanel panel;
	String love = "Love Java";

	public MoveStringFrame() {
		setTitle("Left 키로 문자열 바꾸기");
		setSize(450,200);
		
		panel = new JPanel(new FlowLayout());
		
		label = new JLabel(love);
		panel.add(label);
		
		label.requestFocus();		
		label.setFocusable(true);	
		
		//Click!
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if( keycode == KeyEvent.VK_LEFT) {
					String one = love.substring(0,1);
					love = love.substring(1,9);
					love = love.concat(one);
					label.setText(love);
				}
			}
		});
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MoveStringFrame f = new MoveStringFrame();

	}

}
