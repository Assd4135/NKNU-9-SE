package se;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Wrong {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void Wrong() {
		JFrame framed = new JFrame();
		framed.setTitle("錯誤");
		framed.setVisible(true);
		framed.setSize(300, 300);
		framed.setLocationRelativeTo(null);

		JLabel labelw = new JLabel("ERROR");
		framed.getContentPane().add(labelw);
		labelw.setForeground(new Color(0xFF0000));
		labelw.setFont(new Font("Arial Black", Font.BOLD, 20));
		labelw.setBackground(new Color(0xFFFFFF)); // 背景顏色
		labelw.setOpaque(true);
		labelw.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
		labelw.setVerticalAlignment(JLabel.CENTER);

	}

}
