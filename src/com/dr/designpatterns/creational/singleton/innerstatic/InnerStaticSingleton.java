package com.dr.designpatterns.creational.singleton.innerstatic;
//thread safe
public class InnerStaticSingleton {

	public InnerStaticSingleton() {
	}
	
	private static class Impl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
	

}
