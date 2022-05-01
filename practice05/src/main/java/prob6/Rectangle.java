package prob6;

public class Rectangle extends Shape implements Resizable{
	public static double width;
	public static double height; 
	
	@Override
	public double getArea() {
		double result = width * height;
		return result;
	}

	@Override
	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}

	public Rectangle(int width, int height) {
		Shape.width = (double)width;
		Shape.height = (double)height;
		this.width = (double)width;
		this.height = (double)height;
	}
}
