package com.dr.designpatterns.creational.prototype.copyserial;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {
	
	public static void main(String[] args) {
		Address address = new Address("123 London Road", "London", "UK");
		Address address2 = SerializationUtils.roundtrip(address);
		address2.city = "Bristol";
		
		System.out.println(address);
		System.out.println(address2);
	}

}
