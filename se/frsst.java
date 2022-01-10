package se;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class frsst {

	public static void frsst() {
		JFrame framesst = new JFrame();
		framesst.setLayout(null);
		framesst.setTitle("管理學生資料");
		framesst.setVisible(true);
		framesst.setSize(400, 200);
		framesst.setLocationRelativeTo(null);

		JPasswordField gmpw = new JPasswordField();
		framesst.add(gmpw);
		gmpw.setBounds(150, 65, 100, 30);

		JButton buttonGM = new JButton("search");
		framesst.add(buttonGM);
		buttonGM.setBounds(150, 100, 100, 30);
		buttonGM.setFont(new Font("Arial Black", Font.PLAIN, 10));
		buttonGM.setForeground(new Color(0xF75000));
		buttonGM.setBackground(new Color(0xF0F0F0));
		buttonGM.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttonGM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.text = gmpw.getText();
				readstpf.readstpf();
				framesst.dispose();
				stpd.stpd();
			}
		});

	}

}
