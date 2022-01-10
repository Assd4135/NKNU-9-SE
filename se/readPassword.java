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
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// �Ҽ{��s�X�榡
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
			System.out.println("Ū���ɮפ��e�X��");
			e.printStackTrace();
		}
	}

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // �۹���|�A�p�G�S���h�n�إߤ@�ӷs��output�Ctxt�ɮ�
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}
}
