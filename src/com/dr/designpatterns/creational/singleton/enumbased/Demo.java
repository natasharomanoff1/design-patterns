package com.dr.designpatterns.creational.singleton.enumbased;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	
	static void saveToFile(EnumBasedSingleton singleton, String filename) throws Exception {
		
		try (FileOutputStream fileOut = new FileOutputStream(filename); 
			ObjectOutputStream out = new ObjectOutputStream(fileOut) ) {
			out.writeObject(singleton);
		}
	}
	
	static EnumBasedSingleton readFromFile(String filename) throws Exception {
		
		try (FileInputStream fileIn = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(fileIn) ) {
			return (EnumBasedSingleton) in.readObject();
		}
	}
	
	public static void main(String[] args) throws Exception {
		EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
		
		String filename = "singleton.bin";

	//	singleton.setValue(111);
		
		saveToFile(singleton, filename);
		
		EnumBasedSingleton singleton2 = readFromFile(filename);
		
	//	System.out.println(singleton == singleton2);
	//	System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());
	}

}
