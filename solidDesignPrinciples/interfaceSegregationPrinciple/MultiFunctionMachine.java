package com.dr.solidDesignPrinciples.interfaceSegregationPrinciple;


/*
 * using decorator pattern 
 */
public class MultiFunctionMachine implements MultifunctionDevice {
	
	Printer printer;
	Scanner scanner;

	public MultiFunctionMachine(Printer printer, Scanner scanner) {
		super();
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) {
		printer.print(d);

	}

	@Override
	public void scan(Document d) {
		scanner.scan(d);
	}

}
