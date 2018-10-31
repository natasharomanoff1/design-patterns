package com.dr.solidDesignPrinciples.openClosedPrinciples;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;

	public ColorSpecification(Color color) {
		super();
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.Color == color;
	}

}
