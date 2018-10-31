package com.dr.solidDesignPrinciples.interfaceSegregationPrinciple;

interface Machine {
	
	/*
	 * There should not be more methods that are expected to be implemented
	 */
	
	void print(Document d);
	void fax(Document d) throws Exception;
	void scan(Document d);

}
