package com.gk.beans;


import lombok.ToString;


@ToString
public class Course {
	private int courseId;
	private String courseName;
	private int duration;
	private float fee;
	public Course(int courseId, String courseName, int duration, float fee) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	

}
