package prob6;

public class RectTriangle extends Shape{
	private double width;
	private double height;

	public RectTriangle(int width, int height) {
		Shape.width = (double)width;
		Shape.height = (double)height;
		this.width = (double)width;
		this.height = (double)height;
	}

	@Override
	public double getArea() {
		double result = width * height * 0.5;
		return result;
	}

	@Override
	public double getPerimeter() {
		double result = width + height + Math.sqrt((width*width) + (height*height));
		return result;
	}

	

}
