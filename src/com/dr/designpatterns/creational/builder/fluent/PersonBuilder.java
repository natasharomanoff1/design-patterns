package com.dr.designpatterns.creational.builder.fluent;

public class PersonBuilder<SELF extends PersonBuilder<SELF>>{
	
	protected Person person = new Person();
	
	//public PersonBuilder withName(String name) {
	public SELF withName(String name) {
		person.name = name;
		return (SELF) this;
	}
	
	public Person build() {
		return person;
	}
	
	protected SELF self() {
		return (SELF) this;
	}

}
