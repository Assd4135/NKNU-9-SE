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

public class frgm {

	public static void frgm() {
		
		JFrame framegm = new JFrame();
		framegm.setLayout(null);
		framegm.setTitle("管理者登入");
		framegm.setVisible(true);
		framegm.setSize(400, 200);
		framegm.setLocationRelativeTo(null);
		
		JPasswordField gmpw = new JPasswordField();
		framegm.add(gmpw);
		gmpw.setBounds(150, 80, 100, 30);

		JButton buttonGM = new JButton("LOGIN");
		framegm.add(buttonGM);
		buttonGM.setBounds(150, 130, 100, 30);
		buttonGM.setFont(new Font("Arial Black", Font.PLAIN, 10));
		buttonGM.setForeground(new Color(0xF75000));
		buttonGM.setBackground(new Color(0xF0F0F0));
		buttonGM.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttonGM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.text = gmpw.getText();
				if (se.text.equalsIgnoreCase("1amgm")) {
					frsst.frsst();
					readstpf.readstpf("C:\\Users\\USER\\Desktop\\login.csv");
					framegm.dispose();
				}
				
			}
		});
		
		

	}

}
