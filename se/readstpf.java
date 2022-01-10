package se;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class readstpf {

	public static String readstpf(String filePath) {
		final String delimiter = ",";
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考慮到編碼格式
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					String[] token = lineTxt.split(delimiter);
					for (int i = 0; i < token.length; i++) {
						se.pw[i] = token[i];
						if (se.pw[0].equalsIgnoreCase(se.text)) {
							se.labelstac.setText(se.pw[0]);
							se.labelstpw.setText(se.pw[1]);
							if(se.pw[2].equalsIgnoreCase("1"))
							{
								se.labelstcl.setText("Class A");
							}
							else if(se.pw[2].equalsIgnoreCase("2"))
							{
								se.labelstcl.setText("Class B");
							}
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("讀取檔案內容出錯");
			e.printStackTrace();
		}
		return filePath;

	}

}
