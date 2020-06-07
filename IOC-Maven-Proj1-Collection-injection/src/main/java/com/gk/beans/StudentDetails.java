package com.gk.beans;

import java.util.Date;

import lombok.ToString;
@ToString
public class StudentDetails {
	private int[]marks;
	private Date[] impDates;
	
	public StudentDetails(int[] marks, Date[] impDates) {
		super();
		this.marks = marks;
		this.impDates = impDates;
	}
	
	
	
	
	
	

	

}
