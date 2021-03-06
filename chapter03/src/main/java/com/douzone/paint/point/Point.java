package com.douzone.paint.point;

import com.douzone.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("Draw point[x="+x+", y="+y+"]");
	}
	
	public void show(boolean visable) {
		if(visable) {
			show();
		} else {
			System.out.println("Disapear point[x="+x+", y="+y+"]");
		}
	}

	@Override
	public void draw() {
		show();		
	}

}
