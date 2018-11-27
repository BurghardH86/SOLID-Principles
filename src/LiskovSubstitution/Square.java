package LiskovSubstitution;

public class Square extends Rectangle{

	public Square(double size) {
		super(size, size);
	}
	
	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}
	
	@Override
	public void setHeight(double height) {
		super.setWidth(height);
		super.setHeight(height);
	}

}
