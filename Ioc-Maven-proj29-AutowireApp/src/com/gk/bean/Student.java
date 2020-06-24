package com.gk.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;
@Setter
public class Student {
private String sname;
private int sno;
@Qualifier("crs")
 @Autowired 
private Course course;
@Autowired
private Date dob;

public Student() {
  System.out.println("Student.Student()");
}


public Student(Course course, Date dob) {
	
	this.course = course;
	this.dob = dob;
}
public Student(String sname, int sno, Course course, Date dob) {
	super();
	this.sname = sname;
	this.sno = sno;
	this.course = course;
	this.dob = dob;
}

@Override
public String toString() {
	return "Student [sname=" + sname + ", sno=" + sno + ", course=" + course + ", dob=" + dob + "]";
}






	
	

}
