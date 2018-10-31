package com.dr.designpatterns.creational.prototype.copyserial;

import java.io.Serializable;

public class Address  implements Serializable {
	
	String streetAddress, city, country;

	public Address(String streetAddress, String city, String country) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	} 

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
