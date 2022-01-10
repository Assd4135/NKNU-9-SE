package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Text {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void Text() {

		se.frame4.getContentPane().setLayout(null);
		se.frame4.setTitle("題目");
		se.frame4.setVisible(true);
		se.frame4.setSize(2000, 1500);
		se.frame4.setLocationRelativeTo(null);

		textpaper.labelt1.setBounds(0, 10, 1500, 50);
		textpaper.labelt2.setBounds(0, 60, 1500, 50);
		textpaper.labelt3.setBounds(0, 110, 1500, 50);
		textpaper.labelt4.setBounds(0, 160, 1500, 50);
		textpaper.labelt5.setBounds(0, 210, 1500, 50);
		textpaper.labelt6.setBounds(0, 260, 1500, 50);
		textpaper.labelt7.setBounds(0, 310, 1500, 50);
		textpaper.labelt8.setBounds(0, 360, 1500, 50);
		textpaper.labelt9.setBounds(0, 410, 1500, 50);
		textpaper.labelt10.setBounds(0, 460, 1500, 50);
		
		textpaper.labelt1.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt2.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt3.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt4.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt5.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt6.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt7.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt8.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt9.setFont(new Font("Arial Black", Font.BOLD, 13));
		textpaper.labelt10.setFont(new Font("Arial Black", Font.BOLD, 13));
		
		
		se.frame4.getContentPane().add(textpaper.labelt1);
		se.frame4.getContentPane().add(textpaper.labelt2);
		se.frame4.getContentPane().add(textpaper.labelt3);
		se.frame4.getContentPane().add(textpaper.labelt4);
		se.frame4.getContentPane().add(textpaper.labelt5);
		se.frame4.getContentPane().add(textpaper.labelt6);
		se.frame4.getContentPane().add(textpaper.labelt7);
		se.frame4.getContentPane().add(textpaper.labelt8);
		se.frame4.getContentPane().add(textpaper.labelt9);
		se.frame4.getContentPane().add(textpaper.labelt10);

		se.ans.setBounds(700, 700, 500, 100);
		se.frame4.getContentPane().add(se.ans);

		JButton buttonans = new JButton("繳交");
		buttonans.setFont(new Font("標楷體", Font.PLAIN, 20));
		buttonans.setForeground(new Color(0x272727));
		buttonans.setBackground(new Color(0xF0F0F0));
		buttonans.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 2));
		buttonans.setBounds(800, 820, 300, 50);
		buttonans.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkans.checkans();
				se.frame4.dispose();
			}
		});
		
		se.	frame4.getContentPane().add(buttonans);

		if (se.examm == true) {
			timer.timer();
		}

	}

}
