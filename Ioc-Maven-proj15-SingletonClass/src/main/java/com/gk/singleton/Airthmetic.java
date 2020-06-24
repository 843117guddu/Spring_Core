package com.gk.singleton;

public class Airthmetic {
	private static   Airthmetic INSTANCE;

	private Airthmetic() {
		System.out.println("Airthmetic.Airthmetic()::0-Pram Constructor");

	}
	//create factory method
	public static Airthmetic getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Airthmetic();
			return INSTANCE;
		}
		return INSTANCE;
	}
	public void add(int a,int b) {
		System.out.println("Result:"+(a+b));
	}

}

