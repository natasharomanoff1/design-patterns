package com.dr.solidDesignPrinciples.openClosedPrinciples;
/*
 * Code should be open for extension but not modification
 * This is achieved with interfaces
 */

import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House", Color.BLUE, Size.LARGE);

		
		List<Product> products = List.of(apple, tree, house);
		
		ProductFilter pf = new ProductFilter();
		System.out.println("Green products (old): ");
		pf.filterByColor(products, Color.GREEN)
				.forEach(p -> System.out.println(" - " + p.name + " is green"));
		
		OCPProductFilter opf = new OCPProductFilter();
		System.out.println("Green products (open-closed principle): ");
		opf.filter(products, new ColorSpecification(Color.GREEN))
				.forEach(p -> System.out.println(" - " + p.name + " is green"));
		
		System.out.println("Large blue items (open-closed principle): ");
		opf.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
				.forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
		
	}

}
