package com.dr.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
	
	public String name, text;
	public ArrayList<HtmlElement> elements = new ArrayList<>();
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();
	
	public HtmlElement() {
		
	}
	
	public HtmlElement(String name, String text) {
		this.name = name;
		this.text = text;
	}
	
	private String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		String i = String.join("", Collections.nCopies(indent * indentSize, " "));
		
		//root element
		sb.append(String.format("%s<%s>%s", i, name, newLine));
		
		//add indent to text in element
		if (text != null && !text.isEmpty()) {
			sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
			.append(text)
			.append(newLine);
		}
		
		//child element + text
		for(HtmlElement e: elements) 
			sb.append(e.toStringImpl(indent + 1));
		
		sb.append(String.format("%s</%s>%s", i, name, newLine));
		return sb.toString();
		
	}
	
	@Override
	public String toString() {
		return toStringImpl(0);
	}

}
