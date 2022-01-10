package se;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readstpf {

	public static void readstpf() {
		ArrayList topic = new ArrayList();
		ArrayList answer = new ArrayList();
		ArrayList difficulty = new ArrayList();
		String Data[][];
		String Data2[][];
		final String delimiter = ",";
		try {
			File file = new File("C:\\Users\\USER\\Desktop\\" + se.text + ".txt");
			System.out.println(se.text);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考慮到編碼格式
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					String tempArray[] = lineTxt.split(",");
					if (tempArray[0].equalsIgnoreCase(se.text)) {
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
				System.out.println(Data2[0][0]);
				System.out.println(Data2[0][1]);
				System.out.println(Data2[0][2]);
				se.stac2 = Data2[0][0];
				se.stpw2 = Data2[0][1];
				se.stcl2 = Data2[0][2];
				if (se.stcl2.equalsIgnoreCase("1")) {
					se.cl2 = 1;
				} else if (se.stcl2.equalsIgnoreCase("2")) {
					se.cl2 = 2;
				}
			} else {
				File file2 = new File("C:\\Users\\USER\\Desktop\\login.csv");
				InputStreamReader read2 = new InputStreamReader(new FileInputStream(file2));// 考慮到編碼格式
				BufferedReader br = new BufferedReader(read2);
				String lineTxt = null;
				boolean r = false;
				boolean r2 = false;
				while ((lineTxt = br.readLine()) != null) {
					String tempArray[] = lineTxt.split(",");
					if (tempArray[0].equalsIgnoreCase(se.text)) {
						topic.add(tempArray[0]);
						answer.add(tempArray[1]);
						difficulty.add(tempArray[2]);
					}
				}

				Data = new String[topic.size()][3];
				for (int i = 0; i < topic.size(); i++) {
					Data[i][0] = (String) topic.get(i);
					Data[i][1] = (String) answer.get(i);
					Data[i][2] = (String) difficulty.get(i);
				}
				System.out.println(Data[0][0]);
				System.out.println(Data[0][1]);
				System.out.println(Data[0][2]);
				se.stac2 = Data[0][0];
				se.stpw2 = Data[0][1];
				se.stcl2 = Data[0][2];
				if (se.stcl2.equalsIgnoreCase("1")) {
					se.cl2 = 1;
				} else if (se.stcl2.equalsIgnoreCase("2")) {
					se.cl2 = 2;
				}
			}
			/*
			 * if (i == 0 && se.pw[0].equalsIgnoreCase(se.text)) { se.stac2 = se.pw[i];
			 * System.out.println(se.pw[i]); r = true; r2 = true; } if (i == 1) { if (r ==
			 * true) { se.stpw2 = se.pw[i]; System.out.println(se.stpw2);
			 * System.out.println(r); r = false; } } if (i == 2) { if (r2 == true) {
			 * se.stcl2 = se.pw[i]; System.out.println(se.stcl2); if
			 * (se.stcl2.equalsIgnoreCase("1")) { se.cl2 = 1; } else if
			 * (se.stcl2.equalsIgnoreCase("2")) { se.cl2 = 2; } r2 = false; } }
			 */

		} catch (

		Exception e) {
			System.out.println("讀取檔案內容出錯");
			e.printStackTrace();
		}

	}

}
