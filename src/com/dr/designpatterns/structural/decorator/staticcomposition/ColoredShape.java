package com.dr.designpatterns.structural.decorator.staticcomposition;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
	private Shape shape;
	private String color;

	public ColoredShape(Supplier<? extends T> ctor, String color) {
		shape = ctor.get();
		this.color = color;
	}

	@Override
	public String info() {
		return shape + " has the color " + color;
	}
}
