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
		framealt.setTitle("�ӤH��ƭק�");
		framealt.setVisible(true);
		framealt.setSize(800, 600);
		framealt.setLocationRelativeTo(null);

		
		se.labelac.setBounds(20, 70, 200, 30);
		se.labelpw.setBounds(20, 110, 200, 30);
		se.labelac.setFont(new Font("�L�n������", Font.BOLD, 15));
		se.labelpw.setFont(new Font("�L�n������", Font.BOLD, 15));
		se.labelcl.setBounds(20, 150, 200, 30);
		se.labelcl.setFont(new Font("�L�n������", Font.BOLD, 15));

		se.labelac.setText("�Ǹ�" + " " + se.userac);
		se.labelpw.setText("�K�X" + " " + se.userpw);
		
		
		framealt.add(se.labelac);
		framealt.add(se.labelpw);
		framealt.add(se.labelcl);

		JButton buttonpwlt = new JButton("���");

		buttonpwlt.setFont(new Font("�з���", Font.PLAIN, 20));
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
