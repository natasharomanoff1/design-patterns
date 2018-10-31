package com.dr.designpatterns.structural.bridge;

public class VectorRenderer implements Renderer {

	@Override
	public void renderCircle(float radius) {
		System.out.println("Drawing circle or radius " + radius);
	}
}
