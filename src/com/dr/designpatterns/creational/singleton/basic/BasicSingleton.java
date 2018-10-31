package com.dr.designpatterns.creational.singleton.basic;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
	
	private BasicSingleton() {
		
	}
	
	private static final BasicSingleton INSTANCE = new BasicSingleton();
	
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}
	
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}

}
