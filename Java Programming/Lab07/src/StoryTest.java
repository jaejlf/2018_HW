import java.awt.*;
import javax.swing.*;

public class StoryTest extends JFrame{
	public StoryTest() {
		setTitle("SM Story");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
     	setLayout(null);
		
		JLabel title = new JLabel("SM Story");
		title.setBounds(20, 20, 70, 30);

		JLabel word1 = new JLabel("가을은");
		word1.setBounds(100, 70, 70, 30);
		
		JTextField blank = new JTextField(20);
     	blank.setBounds(200, 135, 100, 30);
     	
     	JLabel word2 = new JLabel("이다");
		word2.setBounds(370, 180, 70, 30);

     	add(title);
     	add(word1);
     	add(blank);
     	add(word2);
     	
		setVisible(true);
		
	}

	public static void main(String[] args) {
		StoryTest f = new StoryTest();

	}

}
