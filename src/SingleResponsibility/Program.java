package SingleResponsibility;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.addEntry("Bananas");
		shoppingList.addEntry("Apples");
		shoppingList.addEntry("Cheese");
		
		Persistance p = new Persistance();
		p.saveToFile(shoppingList.getEntries(), new File("einkaufsliste.txt"));
	}

}
