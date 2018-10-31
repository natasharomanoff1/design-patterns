package com.dr.designpatterns.behavioral.strategy.dynamic;

class MarkdownListStrategy implements ListStrategy {
	@Override
	public void addListItem(StringBuilder stringBuilder, String item) {
		stringBuilder.append(" * ").append(item).append(System.lineSeparator());
	}
}
