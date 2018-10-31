package com.dr.solidDesignPrinciples.dependencyInversionPrinciple;

import java.util.List;

import org.javatuples.Triplet;

/*
 * high-level, business logic
 */
public class Research {
	
	/*
	 * using low-level model in constructor
	 */
	
	//public Research (Relationships relationships) {
		
	//	List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
	//	relations.stream()
	//		.filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
	//		.forEach(ch -> System.out.println("John has a child " + ch.getValue2().name));
	//}
	
	public Research(RelationshipBrowser browser) {
		List<Person> children = browser.findAllChildrenOf("John");
		for(Person child: children) {
			System.out.println("John has a child called " + child.name);
		}
	}
}
