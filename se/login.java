package se;

import java.io.File;

public class login {

	public static boolean login() {
		File file = new File("C:\\Users\\USER\\Desktop\\" + se.acc + ".txt");
		if (file.isFile() && file.exists()) {
			readPassword.readPassword("C:\\Users\\USER\\Desktop\\" + se.acc + ".txt");
			if (se.pww.equalsIgnoreCase(se.pw[1])) {
				se.userac = se.acc;
				se.userpw = se.pw[1];
				if(se.pw[2].equalsIgnoreCase("1"))
				{
					se.labelcl.setText("Class A");
				}
				else if(se.pw[2].equalsIgnoreCase("2"))
				{
					se.labelcl.setText("Class B");
				}
				se.key = true;
				return true;
			}
		} else if (se.acc.equalsIgnoreCase(se.pw[0])) {
			if (se.pww.equalsIgnoreCase(se.pw[1])) {
				se.userac = se.pw[0];
				se.userpw = se.pw[1];
				if(se.pw[2].equalsIgnoreCase("1"))
				{
					se.labelcl.setText("Class A");
					se.cl2 = 1;
				}
				else if(se.pw[2].equalsIgnoreCase("2"))
				{
					se.labelcl.setText("Class B");
					se.cl2 = 2;
				}
				se.key = true;
				return true;
			}
		}
		return false;
	}

}
