package OpenClosed;

public class Program {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(5, 5); //25;
		Rectangle rec2 = new Rectangle(4, 4); //16;
		Rectangle rec3 = new Rectangle(2, 3); //6;
		
		Circle circle1 = new Circle(3); // 28,274
		
		Shape[] shapes = {rec1, rec2, rec3, circle1};
		
		double area = 0;
		for (Shape shape : shapes) {
			area += shape.area();
		}
		System.out.println("Fl�che: " + area);
	}

}
