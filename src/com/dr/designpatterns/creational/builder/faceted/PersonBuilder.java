package com.dr.designpatterns.creational.builder.faceted;

//nuilder facade
public class PersonBuilder {
	
	// the object we're going to build
	protected Person person = new Person(); // reference!
	
	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}
	
	public PersonJobBuilder works() {
	    return new PersonJobBuilder(person);
	}
	
	public Person build() {
		return person;
	}

}
