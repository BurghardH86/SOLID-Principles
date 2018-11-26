package SingleResponsibility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShoppingList {
	private ArrayList<String> entries = new ArrayList<>();
	private static int count = 0;
	
	public ArrayList<String> getEntries(){
		return entries;
	}
	
	public void setEntries(ArrayList<String> entries) {
		this.entries = entries;
	}

	public void addEntry(String text) {
		entries.add((count++) + ": " + text);
	}
	
	public void removeEntry(int index) {
		entries.remove(index);
	}
	
	@Override
	public String toString() {
		String output = "Einkaufsliste: \n";
		for (String entry : entries) {
			output += entry;
			output += "\n";
		}
		return output;		
	}
	
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
