package SingleResponsibility;

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

}
