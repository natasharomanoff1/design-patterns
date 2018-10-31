package com.dr.designpatterns.creational.singleton.lazy;
//lazy and thread safe
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("Initialiying lazy singleton");
	}
	
/*	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}*/
	
	//double-checked locking - outdated
	public static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class)
			{
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

}
