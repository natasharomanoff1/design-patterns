package com.dr.solidDesignPrinciples.interfaceSegregationPrinciple;

public class OldFashionPrinter implements Machine {

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * not used for old fasion printer
	 */
	@Override
	public void fax(Document d) throws Exception {
		throw new Exception();
	}

	/*
	 * not used for old fasion printer
	 */
	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		
	}

}
