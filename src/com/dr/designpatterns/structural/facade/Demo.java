package com.dr.designpatterns.structural.facade;

public class Demo {
	public static void main(String[] args) {

//		Buffer buffer = new Buffer(30, 20);
//		Viewport vp = new Viewport(buffer, 30, 20, 0, 0);
//		Console console = new Console(30, 20);
//		console.addViewport(vp);
//		console.render();
		
		Console console2 = new Console(30, 20);
		console2.render();
	}

}
