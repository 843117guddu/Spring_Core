package com.gk.autowire;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class TravelAgent {
	private TourPlan tp;
	public TravelAgent() {
		
		System.out.println("TravelAgent.TravelAgent()");
	}
	
	  public TravelAgent(TourPlan tp) { this.tp = tp; }
	 
	
	public  String touring() {
		return tp.toString()+"places  visited spending 12000";
	}

	

}
