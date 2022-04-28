package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(20);
		point1.setY(10);		
		drawPoint(point1);
		
		Point point2 = new Point(50, 100);
		drawPoint(point2);
		point2.show(false);
		
		Point point3 = new ColorPoint(40, 50, "red");
		//drawPoint(point3);
		point3.show(true);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	

//	public static void drawColorPoint(ColorPoint point) { 부모로 레퍼런싱 할 수 있도록
//		point.show();
//	}
	
}
