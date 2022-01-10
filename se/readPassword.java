package se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readPassword {

	public static void readPassword(String filePath) {
		ArrayList topic = new ArrayList();
		ArrayList answer = new ArrayList();
		ArrayList difficulty = new ArrayList();
		String Data2[][];
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考慮到編碼格式
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					String tempArray[] = lineTxt.split(",");
					if (tempArray[0].equalsIgnoreCase(se.acc)) {
						topic.add(tempArray[0]);
						answer.add(tempArray[1]);
						difficulty.add(tempArray[2]);
					}
				}

				Data2 = new String[topic.size()][3];
				for (int i = 0; i < topic.size(); i++) {
					Data2[i][0] = (String) topic.get(i);
					Data2[i][1] = (String) answer.get(i);
					Data2[i][2] = (String) difficulty.get(i);
				}
				se.pw[0] = Data2[0][0];
				se.pw[1] = Data2[0][1];
				se.pw[2] = Data2[0][2];
			}
		} catch (Exception e) {
			System.out.println("讀取檔案內容出錯");
			e.printStackTrace();
		}
	}

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}
}
