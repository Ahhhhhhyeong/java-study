package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		// Point point1 = new Point();
		// point1.setX(20);
		// point1.setY(10);
		// point1.show();
		Point point1 = new Point(20, 10);
		draw(point1);
		
		Point point2 = new Point(50, 100);
		draw(point2);
		point2.show(false);

		Point point3 = new ColorPoint(40, 50, "red");
		// drawPoint(point3);
		point3.show(true);

		Triangle triangle = new Triangle();
		draw(triangle);

		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		
		Circle circle = new Circle();
		draw(circle);	
				
		GraphicText graphicText =  new GraphicText("Hello World");
		draw(graphicText);
		
//		// instanceof 연산자 테스트
//		System.out.println(circle instanceof Object); // true
//		System.out.println(circle instanceof Shape); // true
//		System.out.println(circle instanceof Circle); // true
//		
//		// 오류: class는 Hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있음
//		// System.out.println(circle instanceof Rectangle); // error
//		
//		// interface는 Hierachy와 상관없이 instanceof 연산자를 사용할 수 있음
//		System.out.println(circle instanceof Drawable); //true
//		System.out.println(circle instanceof Runnable); //false_확인은 가능함
	
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
	
  // public static void drawColorPoint(ColorPoint point) { 부모로 레퍼런싱 할 수 있도록 
		 // point.show(); 
  // }
	  
//	  public static void drawTriangle(Triangle triangle) { 
//	  		triangle.draw(); 
//	  }
	 
//
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
	
}
