package se;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class succeeded {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void succeeded() {
		JFrame framesu = new JFrame();
		framesu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  SUCCEEDED");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(55, 124, 164, 19);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
		lblNewLabel.setVerticalAlignment(JLabel.CENTER);
		framesu.getContentPane().add(lblNewLabel);
		framesu.setTitle("分數");
		framesu.setVisible(true);
		framesu.setSize(300, 300);
		framesu.setLocationRelativeTo(null);

	}

}
