package com.gk.bean;

import java.util.Date;

public class ScheduleRemainder {
private Date date;

public ScheduleRemainder(Date date) {
	this.date = date;
}
public String remaiderOfTheDay() {
	Date sysDate=null;
	sysDate=new Date();
	if(sysDate.getYear()==date.getYear()&&sysDate.getMonth()==date.getMonth()&&sysDate.getDate()==date.getDate()) 
		return "U are an appoinment today.... call the manager for the details ";
		else
		return "U dont have any appoinments today .... just relax";
	
}
}
