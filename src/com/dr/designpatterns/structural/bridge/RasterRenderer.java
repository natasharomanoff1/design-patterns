package com.dr.designpatterns.structural.bridge;

public class RasterRenderer implements Renderer {

	@Override
	public void renderCircle(float radius) {
		System.out.println("Drawing pixels for circle of radius " + radius);
	}
}