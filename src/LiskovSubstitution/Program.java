package LiskovSubstitution;

public class Program {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 5);
		doSomething(rec1);
		
		Square s1 = new Square(3);
		doSomething(s1);

	}

	public static void doSomething(Rectangle rec) {
		double height = rec.getHeight();
		rec.setWidth(20);
		// 20 * height
		System.out.println("Vermuteter Flächeninhalt: " + (20 * height));
		System.out.println("Tatsächlicher Flächeninhalt: " + rec.area());
	}

}
