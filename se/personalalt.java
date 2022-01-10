package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class personalalt {

	public static void personalalt() {
		JFrame framealt = new JFrame();
		framealt.setLayout(null);
		framealt.setTitle("個人資料修改");
		framealt.setVisible(true);
		framealt.setSize(800, 600);
		framealt.setLocationRelativeTo(null);

		
		se.labelac.setBounds(20, 70, 200, 30);
		se.labelpw.setBounds(20, 110, 200, 30);
		se.labelac.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		se.labelpw.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		se.labelcl.setBounds(20, 150, 200, 30);
		se.labelcl.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		se.labelac.setText("學號" + " " + se.userac);
		se.labelpw.setText("密碼" + " " + se.userpw);
		
		
		framealt.add(se.labelac);
		framealt.add(se.labelpw);
		framealt.add(se.labelcl);

		JButton buttonpwlt = new JButton("更改");

		buttonpwlt.setFont(new Font("標楷體", Font.PLAIN, 20));
		buttonpwlt.setForeground(new Color(0x272727));
		buttonpwlt.setBackground(new Color(0xF0F0F0));
		buttonpwlt.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 2));
		framealt.add(buttonpwlt);
		buttonpwlt.setBounds(450, 110, 50, 30);
		buttonpwlt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				alt2.alt2();

			}
		});

		se.jtpw.setBounds(230, 110, 200, 30);
		framealt.add(se.jtpw);
	}

}
