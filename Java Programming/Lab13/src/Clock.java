import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock extends JFrame implements Runnable{
	Thread runner;
	Font clockFont;
	
	public Clock() {
		setSize(350, 100);
		setVisible(true);
		setResizable(false);
		clockFont = new Font("Serif", Font.BOLD, 40);
		add(new ClockPanel());
		
		runner = new Thread(this);
		runner.start();
	}

	class ClockPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			g.setFont(clockFont);
			g.drawString(timeNow(), 60, 40);
		}
	}
	
	public String timeNow() {
		Calendar now = Calendar.getInstance();
		int hrs = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		return hrs + " : " + min + " : " + sec;
	}
	
	public void run() {
		while(runner == Thread.currentThread()) {
			repaint();
			try { Thread.sleep(1000);}
			catch(InterruptedException e) {
				System.out.println("Thread failed");
			}
		}
	}
	public static void main(String[] args) {
		Clock eg = new Clock();
	}

}
