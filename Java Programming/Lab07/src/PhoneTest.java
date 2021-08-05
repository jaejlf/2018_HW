import java.awt.*;
import javax.swing.*;

public class PhoneTest extends JFrame {
	
	private String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", 
			"*", "0", "#", "send", " ", "end"};

	public PhoneTest() {
		setTitle("전화번호 입력기");
		setSize(400,250);
		
		JPanel panel = new JPanel(); //전체 패널
		
		
		//입력부분
		JPanel blank = new JPanel(new BorderLayout());
		blank.add(new JTextField(50));
		
		//숫자 부분
		JPanel num_panel = new JPanel(new GridLayout(0,3));
		
		JButton[] buttons = new JButton[15]; 
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 3; cols++) {
				buttons[index] = new JButton(labels[index]);
				num_panel.add(buttons[index]);
				index++;
			}
		}
		
		//clear
		JButton clear = new JButton("clear");
		
		panel.add(blank);
		panel.add(num_panel);
		panel.add(clear);
		
		add(panel);
		add(blank, BorderLayout.NORTH);
		add(num_panel, BorderLayout.CENTER);
		add(clear, BorderLayout.EAST);

		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PhoneTest f = new PhoneTest();
	}
}
