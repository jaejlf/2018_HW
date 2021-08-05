import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class GuiTest extends JFrame{
	JPanel panel, p1, p2, p3, p4, p5;
	JTextField name, number, major, phone;
	
	//event
	public class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();	
			
		    //확인
			if(b.getText() == "확인") {
				System.out.print(name.getText());
				System.out.print("     ");
				System.out.print(number.getText());
				System.out.print("     ");
				System.out.print(major.getText());
				System.out.print("     ");
				System.out.print(phone.getText());
				System.out.print("     ");
				
			}

			
			//취소
			else {
				//이름
				name.setText("");
				//p1.add(name, BorderLayout.CENTER);
				
				//학번
				number.setText("");
				//p2.add(number, BorderLayout.CENTER);
				
				//전공
				major.setText("");
				//p3.add(major, BorderLayout.CENTER);
				
				//연락처
				phone.setText("");
				//p4.add(phone, BorderLayout.CENTER);
							
			}
		}
	}
	
		
	public GuiTest() {
		setTitle("GuiTest");
		setSize(330,170);
		
		panel = new JPanel(new GridLayout(0,1));
		
		p1 = new JPanel(new BorderLayout(20,20));
		p1.add(new JLabel("이    름"), BorderLayout.WEST);
		name = new JTextField(20);
		p1.add(name, BorderLayout.CENTER);
		
	
		p2 = new JPanel(new BorderLayout(20,20));
		p2.add(new JLabel("학    번"), BorderLayout.WEST);
		number = new JTextField(20);
		p2.add(number, BorderLayout.CENTER);
		
		p3 = new JPanel(new BorderLayout(20,20));
		p3.add(new JLabel("전    공"), BorderLayout.WEST);
		major = new JTextField(20);
		p3.add(major, BorderLayout.CENTER);
		
		p4 = new JPanel(new BorderLayout(20,20));
		p4.add(new JLabel("연락처"), BorderLayout.WEST);
		phone = new JTextField(20);
		p4.add(phone, BorderLayout.CENTER);
		
		p5 = new JPanel(new FlowLayout());
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		
		//button action
		button1.addActionListener(new MyListener());
		button2.addActionListener(new MyListener());
		
		p5.add(button1);
		p5.add(button2);
		
		//panel에 add
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
