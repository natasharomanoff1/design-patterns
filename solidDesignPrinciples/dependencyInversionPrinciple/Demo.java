package com.dr.solidDesignPrinciples.dependencyInversionPrinciple;

/*
 * A. High-level modules should not depend on low level modules. Both should depend on abstraction
 * 
 * B. Abstraction should not depend on details. Details should depend on abstraction
 */

public class Demo {
	public static void main(String[] args) {
		
		Person parent = new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Matt");
		
		Relationships r = new Relationships();
		r.addParentAndChild(parent, child1);
		r.addParentAndChild(parent, child2);
		
		new Research(r);
		
	}
}
