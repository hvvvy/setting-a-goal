package model;

import java.util.ArrayList;

class Point{
	int x;
	int y;

	Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	void printInfo() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
}

public class test{
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();

		pointList.add(new Point(0,8));
		pointList.add(new Point(1,6));
		pointList.add(new Point(2,9));
		pointList.add(new Point(3,3));

		pointList.sort((p0,p1) -> (p0.x + p0.y) - (p1.x + p1.y) );

		pointList.forEach( p -> p.printInfo());
	}
}
