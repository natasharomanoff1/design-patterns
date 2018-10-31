package com.dr.designpatterns.structural.proxy.protection;

public class Car implements Drivable {

	protected Driver driver;

	public Car(Driver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void drive() {
		System.out.println("Car being driven");
	}

}
