package SingleResponsibility;

public class Program {

	public static void main(String[] args) {
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.addEntry("Bananas");
		shoppingList.addEntry("Apples");
		shoppingList.addEntry("Cheese");
		
		System.out.println(shoppingList);
	}

}
