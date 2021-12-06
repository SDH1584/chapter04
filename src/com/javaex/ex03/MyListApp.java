package com.javaex.ex03;

import com.javaex.ex01.PointList;

import com.javaex.ex02.CircleList;

public class MyListApp {
	public static void main(String[] args) {

	Point p01=new Point (4,7);
	Point p02=new Point(8,17);
	Circle c01=new Circle(5);
	Circle c02=new Circle(6);
	
	MyList <Point>pList=new MyList();
	pList.add(p01);
	pList.add(p02);
	System.out.println(pList.toString());
	
	MyList <Circle> cList=new MyList();
	cList.add(c01);
	cList.add(c02);
	System.out.println(cList.toString());
	
	
}
	
}