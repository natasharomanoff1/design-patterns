package com.dr.designpatterns.creational.prototype.copyconstructor;

public class Address {
	
	String streetAddress, city, country;

	public Address(String streetAddress, String city, String country) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	}
	
	public Address(Address other) {
		this(other.streetAddress, other.city, other.country);
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
