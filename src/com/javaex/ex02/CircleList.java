package com.javaex.ex02;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;

	public CircleList() {
		this.cArray=new Circle[3];
		this.crtPos=0;
	}
	
	public void add(Circle C) {
		cArray[crtPos]=C;
		crtPos++;
	}
	public Circle get(int index) {
	 Circle result= cArray[index];
	 return result;
	}
public int size() {
	return crtPos;
}

}
