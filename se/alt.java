package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class alt {

	public static void alt() throws IOException {
		String filePath = "C:\\Users\\USER\\Desktop\\" + se.stac + ".txt";
		File writename = new File("C:\\Users\\USER\\Desktop\\" + se.stac + ".txt");
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		if (writename.isFile() && writename.exists()) {
			br.write(se.stac + " ");
			br.newLine();
			br.write(se.stpw + " ");
			br.newLine();
			br.write(se.stcl + "\n" );
			br.newLine();
			br.flush();
			br.close();
		} else {

			br.write(se.stac + " " );
			br.newLine();
			br.write(se.stpw + " " );
			br.newLine();
			br.write(se.stcl + "\n");
			br.newLine();
			br.flush();
			br.close();

		}
	}

}
