package LiskovSubstitution;

public class Sqaure extends Rectangle{

	public Sqaure(double size) {
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
