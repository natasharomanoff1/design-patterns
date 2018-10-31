package com.dr.solidDesignPrinciples.liskovSubstitutionPrinciple;

public class Square extends Rectangle {
	
	public Square() {}
	
	//repare violation of Liskov substitution principle
	public Square(int size) {
		width = height = size;
	}
	
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
}
