package com.dr.designpatterns.creational.builder;

public class Demo {
	
	public static void main(String[] args) {
		HtmlBuilder builder = new HtmlBuilder("ul");
		builder.addChild("li", "hello");
		builder.addChild("li", "world");
		System.out.println(builder);
		
		System.out.println("\n\nFluent builder:\n");
		
		//fluent builder
		HtmlBuilder fluentBuilder = new HtmlBuilder("ul");
		fluentBuilder.addChild2("li", "hello")
		.addChild("li", "world");
		System.out.println(fluentBuilder);
	}

}
