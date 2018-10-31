package com.dr.solidDesignPrinciples.liskovSubstitutionPrinciple;

/*
 * Liskov substitution principle states that you should be able to substitute derived class for a base class
 * 
 */

public class Demo {
	
	/*
	 *  method works correctly only for rectangle,
	 *  Liskov substitute priciple is violated  
	 */
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		// area = width * 10;
		
		System.out.println("Expect area of " + (width*10) + ", got " +r.getArea());
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2,3);
		useIt(rc);
		
		/*
		 * results into incorrect code throught inheritance
		 */
		Rectangle sq = new Square();
		sq.setWidth(5);
		useIt(sq);
	}

}
