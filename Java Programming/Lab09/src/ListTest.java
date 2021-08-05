import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest extends JFrame implements KeyListener, ListSelectionListener, ActionListener{
	JTextField input, blank;
	JPanel panel, south;
	JButton b1, b2;
	JList<String> list;
	Vector<String> v;
	
	int index = 0;
	
	public ListTest() {
		setTitle("����Ʈ �׽�Ʈ");
		setSize(430, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		panel = new JPanel(new BorderLayout());
		add(panel);
		
		//
		v = new Vector<String>();
		list = new JList<String>(v);
		
		input = new JTextField(30);
				
		south = new JPanel(new FlowLayout());		
		blank = new JTextField(25);
		b1 = new JButton("����");
		b2 = new JButton("����");
		
		south.add(blank);
		south.add(b1);
		south.add(b2);
		
		//panel.add
		panel.add(input, BorderLayout.NORTH);
		panel.add(new JScrollPane(list), BorderLayout.CENTER);
		panel.add(south, BorderLayout.SOUTH);
				
		//Listener
		b1.addActionListener(this);
		b2.addActionListener(this);
		list.addListSelectionListener(this);
		input.addKeyListener(this);
		
		add(panel);
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		//���� ������ ��
		if(keycode == KeyEvent.VK_ENTER) {
			v.add(input.getText());
			input.setText(""); //input â �ʱ�ȭ
			list.setListData(v);
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		String point = (String)list.getSelectedValue(); //���õ� ��
		blank.setText(point);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();	

		//����
		if(b.getText() == "����") {
			index = list.getSelectedIndex();
			String reset = blank.getText();
			v.setElementAt(reset, index);
			list.setListData(v);
		}
		
		//����
		else {
			index = list.getSelectedIndex();
			v.remove(index);
			list.setListData(v);
		}
		
	}

	
	//��� ����
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		ListTest f = new ListTest();
	}
	
}

