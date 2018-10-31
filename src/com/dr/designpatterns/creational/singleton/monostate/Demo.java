package com.dr.designpatterns.creational.singleton.monostate;

public class Demo {
	
	public static void main(String[] args) {
		ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
		ceo.setName("Steve Jobs");
		ceo.setAge(55);
		
		//already initialized
		ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
		System.out.println(ceo2);
	}

}
