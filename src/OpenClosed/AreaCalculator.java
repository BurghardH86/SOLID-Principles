package OpenClosed;

public class AreaCalculator {
	
	// The following method hurts the open-closed principle if another 
	// shape is added
	public double calculateArea(Object[] shapes) {
		double area = 0;
		for (Object shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape;
				area += rectangle.getHeight() * rectangle.getWidth();
			} else {
				Circle circle = (Circle) shape;
				area += circle.getRadius() * circle.getRadius() *Math.PI;
			}
			
		}
		return area;
	}

}
