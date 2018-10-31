package com.dr.solidDesignPrinciples.dependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

/*
 * low-level implementation, manipulation with data, no business logic
 */
public class Relationships implements RelationshipBrowser {
	
	private List<Triplet<Person, Relationship, Person>> relations 
		= new ArrayList<>();
	
	public Relationships() {}
	

	public void addParentAndChild(Person parent, Person child) {
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}
	
	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}


	@Override
	public List<Person> findAllChildrenOf(String name) {
		return relations.stream()
				.filter(x -> Objects.equals(x.getValue0().name, name) 
						&& x.getValue1() == Relationship.PARENT)
				.map(Triplet::getValue2)
				.collect(Collectors.toList());
	}
}
