package com.dr.solidDesignPrinciples.liskovSubstitutionPrinciple;

public class RectangleFactory {
	
	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width, height);
	}
	
	//repare violation of Liskov substitution principle
	public static Rectangle newSquare(int side) {
		return new Rectangle(side, side);
	}

}
