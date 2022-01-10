package se;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class fr {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void fr() {
		JFrame framef = new JFrame();
		framef.getContentPane().setLayout(new FlowLayout());
		framef.setTitle("¬ì¥Ø¿ï¾Ü");
		framef.setVisible(true);
		framef.setSize(204, 167);
		framef.setLocationRelativeTo(null);
		framef.getContentPane().add(se.button3);
		framef.getContentPane().add(se.button4);
	}
}
