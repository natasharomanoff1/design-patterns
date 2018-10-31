package com.dr.designpatterns.creational.prototype.copyconstructor;

public class Employee {
	
	String name;
	Address address;
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public Employee(Employee other) {
		name = other.name;
		address = new Address(other.address );
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
