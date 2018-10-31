package com.dr.designpatterns.creational.factory.method;

public class Point {
	
	private double x, y;
	
	//make constructor private to force user to use factory methods
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	private Point(double a, double b, CoordinateSystem cs) {
		switch(cs) {
		case CARTESIAN:
			this.x = a;
			this.y = b;
			break;
		case POLAR:
			x = a * Math.cos(b);
			y = a * Math.sin(b);
		}
	}*/
	
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x,y);
	}
	
	public static Point newPolarPoint(double rho, double theta) {
		return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
	}

}
