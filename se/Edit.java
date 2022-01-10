package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Edit {
	static int t = 0;
	private static JTextField textField;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void Edit() {
		JFrame framed = new JFrame();
		framed.getContentPane().setLayout(null);
		framed.setTitle("編輯題庫");
		framed.setVisible(true);
		framed.setSize(900, 600);
		framed.setLocationRelativeTo(null);

		JButton buttont = new JButton("新增");
		buttont.setBounds(350, 200, 200, 50);
		buttont.setFont(new Font("標楷體", Font.BOLD, 20));
		buttont.setForeground(new Color(0x272727));
		buttont.setBackground(new Color(0xE0E0E0));
		buttont.setBorder(BorderFactory.createLineBorder(new Color(0x9D9D9D), 5));

		JRadioButton math = new JRadioButton("英文A");
		JRadioButton en = new JRadioButton("英文B");
		math.setBounds(300, 50, 100, 40);
		en.setBounds(500, 50, 100, 40);
		math.setFont(new Font("標楷體", Font.BOLD, 20));
		math.setForeground(new Color(0x272727));
		math.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		en.setFont(new Font("標楷體", Font.BOLD, 20));
		en.setForeground(new Color(0x272727));
		en.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(math);
		buttonGroup.add(en);
		
		JTextArea jta2 = new JTextArea(10, 15);
		JTextArea jta3 = new JTextArea(10, 15);

		se.jta.setBounds(50, 300, 250, 200);
		framed.getContentPane().add(se.jta);
		jta2.setBounds(688, 410, 120, 90);
		framed.getContentPane().add(jta2);
		jta3.setBounds(688, 300, 120, 90);
		framed.getContentPane().add(jta3);

		framed.getContentPane().add(math);
		framed.getContentPane().add(en);
		framed.getContentPane().add(buttont);
		
		textField = new JTextField();
		textField.setBounds(50, 300, 609, 200);
		framed.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u984C\u76EE");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(55, 281, 46, 15);
		framed.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7B54\u6848");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(688, 281, 46, 15);
		framed.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u96E3\u5EA6");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setBounds(688, 392, 46, 15);
		framed.getContentPane().add(lblNewLabel_2);
		buttont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					se.textword = textField.getText();
					se.textans = jta2.getText();
					se.textd = jta3.getText();
					if (math.isSelected()) {
						try {
							writetext.writetext("C:\\Users\\USER\\Desktop\\text.csv");
							succeeded.succeeded();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (en.isSelected()) {
						try {
							writetext.writetext("C:\\Users\\USER\\Desktop\\text.csv");
							succeeded.succeeded();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
			}
		});
	}
}
