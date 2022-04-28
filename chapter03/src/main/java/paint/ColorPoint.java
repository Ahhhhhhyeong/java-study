package paint;

public class ColorPoint extends Point {
	private String color;
	
	
	public ColorPoint(int x, int y, String color) {
		setX(x);
		setY(y);
		this.color = color;
	}

	@Override
	public void show() {	// 시그니처, 이름 다 같아야 오버라이딩 가능
		System.out.println(
				"Draw point[x="+getX()
				+", y="+getY()
				+", color=" + color 
				+"]");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
