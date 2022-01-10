package se;

import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class timer {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void timer() {
		JFrame jframetime = new JFrame();
		jframetime.setResizable(false);
		JLabel jLabelt = new JLabel();
		
		jframetime.getContentPane().setLayout(new FlowLayout());
		jframetime.setTitle("®É¶¡");
		jframetime.setSize(400, 100);
		jframetime.getContentPane().add(jLabelt);
		jframetime.setVisible(true);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			int i = 600;

			public void run() {
				jLabelt.setText("Time left: " + i);
				i--;
				if (i < 0) {
					timer.cancel();
					jLabelt.setText("Time Over");
				}
			}
		}, 0, 1000);
	}

}
