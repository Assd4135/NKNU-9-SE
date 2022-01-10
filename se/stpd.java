package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class stpd {

	public static void stpd() {
		JFrame framest = new JFrame();
		framest.setLayout(null);
		framest.setTitle("管理學生資料");
		framest.setVisible(true);
		framest.setSize(800, 600);
		framest.setLocationRelativeTo(null);
		
		JPasswordField gmac = new JPasswordField();
		gmac.setBounds(250, 80, 150, 30);
		framest.add(gmac);
		
		JPasswordField gmapw = new JPasswordField();
		gmapw.setBounds(250, 120, 150, 30);
		framest.add(gmapw);
		
		JPasswordField gmcl = new JPasswordField();
		gmcl.setBounds(250, 160, 150, 30);
		framest.add(gmcl);
		
		JButton buttonac = new JButton("change");
		framest.add(buttonac);
		buttonac.setBounds(440, 80, 130, 30);
		buttonac.setFont(new Font("Arial Black", Font.PLAIN, 10));
		buttonac.setForeground(new Color(0xF75000));
		buttonac.setBackground(new Color(0xF0F0F0));
		buttonac.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttonac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.stac = gmac.getText();
				try {
					alt.alt();
					succeeded.succeeded();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton buttonpw = new JButton("change");
		framest.add(buttonpw);
		buttonpw.setBounds(440, 120, 130, 30);
		buttonpw.setFont(new Font("Arial Black", Font.PLAIN, 10));
		buttonpw.setForeground(new Color(0xF75000));
		buttonpw.setBackground(new Color(0xF0F0F0));
		buttonpw.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttonpw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.stpw = gmapw.getText();
				try {
					alt.alt();
					succeeded.succeeded();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		JButton buttoncl = new JButton("change");
		framest.add(buttoncl);
		buttoncl.setBounds(440, 160, 130, 30);
		buttoncl.setFont(new Font("Arial Black", Font.PLAIN, 10));
		buttoncl.setForeground(new Color(0xF75000));
		buttoncl.setBackground(new Color(0xF0F0F0));
		buttoncl.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttoncl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.stcl = gmcl.getText();
				try {
					alt.alt();
					succeeded.succeeded();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		

		se.labelstac.setBounds(20, 80, 200, 30);
		se.labelstpw.setBounds(20, 120, 200, 30);
		se.labelstcl.setBounds(20, 160, 200, 30);
		se.labelstac.setFont(new Font("Arial Black", Font.BOLD, 15));
		se.labelstpw.setFont(new Font("Arial Black", Font.BOLD, 15));
		se.labelstcl.setFont(new Font("Arial Black", Font.BOLD, 15));

		framest.add(se.labelstac);
		framest.add(se.labelstpw);
		framest.add(se.labelstcl);
	}

}
