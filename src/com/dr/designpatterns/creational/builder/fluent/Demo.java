package com.dr.designpatterns.creational.builder.fluent;
//fluent builder inheritance with recursive generics

public class Demo {
	
	public static void main(String[] args) {
		EmployeeBuilder pb = new EmployeeBuilder();
		Person john = pb.withName("John")
				.worksAt("developer")
				.build();
		
		System.out.println(john);
	}

}
