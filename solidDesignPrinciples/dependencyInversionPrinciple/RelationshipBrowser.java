package com.dr.solidDesignPrinciples.dependencyInversionPrinciple;

import java.util.List;

/*
 * abstraction to implement on the low-level model
 */
public interface RelationshipBrowser {
	
	List<Person> findAllChildrenOf(String name);

}
