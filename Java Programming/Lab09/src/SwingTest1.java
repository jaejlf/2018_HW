import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingTest1 extends JFrame implements ActionListener{
	JPanel panel;
	JTextField blank;
	JCheckBox checkbox1, checkbox2;
	
	public SwingTest1() {
		setTitle("체크박스와 텍스트 입력");
		setSize(400,120);
		
		panel = new JPanel();
		
		checkbox1 = new JCheckBox("텍스트 입력 편집불가");
		checkbox2 = new JCheckBox("텍스트 입력 감추기");
		
		blank = new JTextField(30);
		
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(blank);
		
		checkbox1.addActionListener(this);
		checkbox2.addActionListener(this);
		blank.addActionListener(this);
		add(panel);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == checkbox1) {
			if(checkbox1.isSelected()) {
				blank.setEditable(false);
			}
			else blank.setEditable(true);
		}
		if(e.getSource() == checkbox2) {
			if(checkbox2.isSelected()) {
				blank.setVisible(false);
			}
			else blank.setVisible(true);
		}
		}
	

	public static void main(String[] args) {
		SwingTest1 f = new SwingTest1();
		

	}

}
