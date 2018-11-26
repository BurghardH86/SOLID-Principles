package OpenClosed;

public class Program {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(5, 5); //25;
		Rectangle rec2 = new Rectangle(4, 4); //16;
		Rectangle rec3 = new Rectangle(2, 3); //6;
		
		Rectangle[] recArray = {rec1, rec2, rec3};
		
		AreaCalculator ac = new AreaCalculator();
		System.out.println("Fläche: " + ac.calculateArea(recArray));
	}

}
