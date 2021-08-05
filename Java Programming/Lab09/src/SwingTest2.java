import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingTest2 extends JFrame implements KeyListener{
	JPanel panel;
	JTextField blank;
	String[] list = {};
	JComboBox<String> comlist;
	String input;
	
	public SwingTest2() {
		setTitle("이름 추가");
		setSize(400,300);
		
		panel = new JPanel();
		
		blank = new JTextField(20);
		blank.addKeyListener(this);
		
		comlist = new JComboBox<>(list);
		
		panel.add(blank);
		panel.add(comlist);
		add(panel);
		setVisible(true);
				
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		//엔터 눌렀을 때
		if(keycode == KeyEvent.VK_ENTER) {
			input = blank.getText();
			blank.setText("");
			comlist.addItem(input);
		}
	}
	
	//사용 안함
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		SwingTest2 f = new SwingTest2();

	}

}
