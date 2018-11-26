package OpenClosed;

public class AreaCalculator {
	
	public double calculateArea(Rectangle[] rectangles) {
		double area = 0;
		for (Rectangle rectangle : rectangles) {
			area += rectangle.getHeight() * rectangle.getHeight();
		}
		return area;
	}

}
