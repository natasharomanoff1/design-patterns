package com.dr.designpatterns.behavioral.interpreter;

public class Token {
	
	public Type type;
	public String text;
	
	public enum Type {
		INTEGER,
		PLUS,
		MINUS,
		LPAREN,
		RPAREN
	}
	
	public Token(Type type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "`"+text+"`";
	}
}
