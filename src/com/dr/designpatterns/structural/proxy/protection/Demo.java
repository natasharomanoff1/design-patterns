package com.dr.designpatterns.structural.proxy.protection;

public class Demo {
	public static void main(String[] args) {
		Car car = new Car(new Driver(12));
		car.drive();
		Car cp = new CarProxy(new Driver(12));
		cp.drive();
	}
}
