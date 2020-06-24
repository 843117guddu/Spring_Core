package com.gk.singleton;

public class Printer {
	//take instance
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.Printer():o-pram constructor");
	}
//create a static factory method
	static public Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE= new Printer(); 
			return INSTANCE;
	     }
		return INSTANCE;
	}
	public void getMessage(String msg) {
		System.out.println(msg+"Printer");
	}
}
