package se;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class personalcheck {

	public static void personalcheck() {
		
		JFrame framech = new JFrame();
		framech.setLayout(null);
		framech.setTitle("�ӤH��Ƭd��");
		framech.setVisible(true);
		framech.setSize(800, 600);
		framech.setLocationRelativeTo(null);

		se.labelac.setBounds(20, 70, 200, 30);
		se.labelpw.setBounds(20, 110, 200, 30);
		se.labelac.setFont(new Font("�L�n������", Font.BOLD, 15));
		se.labelpw.setFont(new Font("�L�n������", Font.BOLD, 15));
		se.labelcl.setBounds(20, 150, 200, 30);
		se.labelcl.setFont(new Font("�L�n������", Font.BOLD, 15));
		
		se.labelac.setText("�Ǹ�" + " " + se.userac);
		se.	labelpw.setText("�K�X" + " " + se.userpw);
		
		
		/* if(se.pw[2].equalsIgnoreCase("1"))
		{
			se.labelcl.setText("Class A");
		}
		else if(se.pw[2].equalsIgnoreCase("2"))
		{
			se.labelcl.setText("Class B");
		} */

		framech.add(se.labelac);
		framech.add(se.labelpw);
		framech.add(se.labelcl);
	}

}
