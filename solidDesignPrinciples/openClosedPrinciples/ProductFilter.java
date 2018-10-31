package com.dr.solidDesignPrinciples.openClosedPrinciples;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
	
	public Stream<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(p -> p.Color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
		return products.stream().filter(p -> p.size == size && p.Color == color);
	}

}
