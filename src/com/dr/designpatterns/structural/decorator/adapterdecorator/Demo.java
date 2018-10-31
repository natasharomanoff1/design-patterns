package com.dr.designpatterns.structural.decorator.adapterdecorator;

public class Demo {
	public static void main(String[] args) {
		MyStringBuilder msb = new MyStringBuilder();
		msb.append("hello").appendLine(" world");
		System.out.println(msb.concat("and this too"));
	}
}
