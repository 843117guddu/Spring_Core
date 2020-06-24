package com.gk.singleton;

public class CalculateAreaOfCircle {
	private  final  float pi=3.14f;
	private static CalculateAreaOfCircle INSTANCE;
	private CalculateAreaOfCircle() {
		System.out.println("CalculateAreaOfCircle.CalculateAreaOfCircle()");
	}
	//create factory method
	public static CalculateAreaOfCircle getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new CalculateAreaOfCircle();
			return INSTANCE;
		}
		return INSTANCE;
	}
	public void calcArea(float r) {
		System.out.println("Area of the circle::"+(pi*r*r));
	}
	

}
