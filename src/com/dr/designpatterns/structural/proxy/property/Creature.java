package com.dr.designpatterns.structural.proxy.property;

public class Creature {
	private Property<Integer> agility = new Property<>(5);

	public int getAgility() {
		return agility.getValue();
	}

	public void setAgility(int value) {
		agility.setValue(value);
	}
	
	
}
