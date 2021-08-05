import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CalcFrame extends JFrame{
	JPanel panel;
	JLabel x;
	JTextField num1, num2, answer;
	JButton equals;
	int n_num1, n_num2, n_result;
	String result;
	
	public class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			n_num1 = Integer.parseInt(num1.getText());
			n_num2 = Integer.parseInt(num2.getText());
			n_result = n_num1 * n_num2;
			
			result = n_result + "";
			
			answer.setText(result);
		}
	}
	
	public CalcFrame() {
		setTitle("°è»ê±â");
		setSize(500,120);
		
		panel = new JPanel(new FlowLayout());
		
		num1 = new JTextField(10);
		x = new JLabel("X");
		num2 = new JTextField(10);
		equals = new JButton("=");
		equals.addActionListener(new MyListener());
		answer = new JTextField(10);
		
		panel.add(num1);
		panel.add(x);
		panel.add(num2);
		panel.add(equals);
		panel.add(answer);
		add(panel);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		CalcFrame f = new CalcFrame();
	}

}
