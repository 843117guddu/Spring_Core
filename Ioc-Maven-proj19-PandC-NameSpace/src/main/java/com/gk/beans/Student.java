package com.gk.beans;

import java.util.Date;


public class Student {
	private int sno;
	private String sname;
	private String sadd;
	private Date dob;
	private Course course;
	public Student(int sno, String sname, String sadd, Date dob, Course course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.dob = dob;
		this.course = course;
	}
	
}
