import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class FontTest extends JFrame implements ActionListener{
	JPanel panel, p1, p2, p3;
	JLabel l1, l2, l3, l4;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2;
	JComboBox<Integer> combo;
	Integer[] list = {10, 15, 20, 25, 30, 35, 40};
	JTextField blank;
	
	String input;
	String font = "굴림체";
	int style = Font.PLAIN;
	Integer size;
	JLabel presult;
	
	public FontTest() {
		setTitle("Font 설정");
		setSize(350, 330);
		setLayout(null);
			
		//p1
		p1 = new JPanel(new FlowLayout());
			
		r1 = new JRadioButton("굴림");
		r2 = new JRadioButton("돋움");
		r3 = new JRadioButton("궁서");
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		p1.add(r1); p1.add(r2); p1.add(r3);
				
		//p2
		p2 = new JPanel(new FlowLayout());
		
		c1 = new JCheckBox("BOLD");
		c2 = new JCheckBox("ITALIC");
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		
		p2.add(c1); p2.add(c2);

		//combo
		combo = new JComboBox<>(list);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		
		//blank
		blank = new JTextField(20);
		blank.addActionListener(this);
		
		//p3
		p3 = new JPanel(new FlowLayout());
		
	    //Border border = BorderFactory.createTitledBorder("Font 설정 결과");
		p3.setBorder(BorderFactory.createTitledBorder("Font 설정 결과"));
		presult = new JLabel("");
		p3.add(presult);
		
		//label
		l1 = new JLabel("Font 설정");	
		l2 = new JLabel("Style 설정");
		l3 = new JLabel("Size 설정");
		l4 = new JLabel("Text 내용");

		//add
		l1.setBounds(10, 20, 70, 15); add(l1);
		l2.setBounds(10, 60, 70, 15); add(l2);
		l3.setBounds(10, 110, 70, 15); add(l3);
		l4.setBounds(10, 160, 70, 15); add(l4);
		
		p1.setBounds(60, 7, 300, 40); add(p1);
		p2.setBounds(60, 47, 300, 40); add(p2);
		combo.setBounds(98, 97,230, 35); add(combo);
		blank.setBounds(98, 150, 230, 35); add(blank);
		p3.setBounds(5, 190, 325, 100); add(p3);
				
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		input = blank.getText();
		presult.setText(input);
		
		//폰트 설정
		if(e.getSource() == r1) { font = "굴림체"; }
		else if(e.getSource() == r2) { font = "돋움체"; }
		else if(e.getSource() == r3) { font = "궁서체"; }
		
		//크기 설정
		size = list[combo.getSelectedIndex()];
		
		//스타일 설정
		if(e.getSource() == c1) {
			if(c1.isSelected()) { 
				if(c2.isSelected()) { style = Font.BOLD + Font.ITALIC; } //c1,c2
				else { style = Font.BOLD; } //c1
			}
			else {
				if(c2.isSelected()) { style = Font.ITALIC; } //c2
				else { style = Font.PLAIN; } //null
			}
		}
		
		if(e.getSource() == c2) {
			if(c2.isSelected()) { 
				if(c1.isSelected()) { style = Font.BOLD + Font.ITALIC; } //c1,c2
				else { style = Font.ITALIC; } //c2
			}
			else {
				if(c1.isSelected()) { style = Font.BOLD; } //c1
				else { style = Font.PLAIN; } //null
			}
		}
		
		presult.setFont(new Font(font, style, size));				
	}
		
	public static void main(String[] args) {
		FontTest f = new FontTest();
	}
}
