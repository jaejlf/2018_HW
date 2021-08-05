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
			
		    //Ȯ��
			if(b.getText() == "Ȯ��") {
				System.out.print(name.getText());
				System.out.print("     ");
				System.out.print(number.getText());
				System.out.print("     ");
				System.out.print(major.getText());
				System.out.print("     ");
				System.out.print(phone.getText());
				System.out.print("     ");
				
			}

			
			//���
			else {
				//�̸�
				name.setText("");
				//p1.add(name, BorderLayout.CENTER);
				
				//�й�
				number.setText("");
				//p2.add(number, BorderLayout.CENTER);
				
				//����
				major.setText("");
				//p3.add(major, BorderLayout.CENTER);
				
				//����ó
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
		p1.add(new JLabel("��    ��"), BorderLayout.WEST);
		name = new JTextField(20);
		p1.add(name, BorderLayout.CENTER);
		
	
		p2 = new JPanel(new BorderLayout(20,20));
		p2.add(new JLabel("��    ��"), BorderLayout.WEST);
		number = new JTextField(20);
		p2.add(number, BorderLayout.CENTER);
		
		p3 = new JPanel(new BorderLayout(20,20));
		p3.add(new JLabel("��    ��"), BorderLayout.WEST);
		major = new JTextField(20);
		p3.add(major, BorderLayout.CENTER);
		
		p4 = new JPanel(new BorderLayout(20,20));
		p4.add(new JLabel("����ó"), BorderLayout.WEST);
		phone = new JTextField(20);
		p4.add(phone, BorderLayout.CENTER);
		
		p5 = new JPanel(new FlowLayout());
		JButton button1 = new JButton("Ȯ��");
		JButton button2 = new JButton("���");
		
		//button action
		button1.addActionListener(new MyListener());
		button2.addActionListener(new MyListener());
		
		p5.add(button1);
		p5.add(button2);
		
		//panel�� add
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
