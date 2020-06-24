package com.gk.autowire;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class TravelAgent {
	private TourPlan tp1;
	public TravelAgent() {
		
		System.out.println("TravelAgent.TravelAgent()");
	}
	
	  public TravelAgent(TourPlan tp1) { this.tp1 = tp1; }
	 
	
	public  String touring() {
		return tp1.toString()+"places  visited spending 12000";
	}

	

}
