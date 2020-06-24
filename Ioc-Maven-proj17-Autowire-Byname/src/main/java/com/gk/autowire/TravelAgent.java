package com.gk.autowire;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class TravelAgent {
	private TourPlan tp;
	public  String touring() {
		return tp.toString()+"places  visited spending 12000";
	}

}
