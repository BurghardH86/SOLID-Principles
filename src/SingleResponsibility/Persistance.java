package SingleResponsibility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistance {
	
	public void saveToFile(ArrayList<String> list, File filename) {

		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(filename));
			for (String string : list) {
				pw.println(string);
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
