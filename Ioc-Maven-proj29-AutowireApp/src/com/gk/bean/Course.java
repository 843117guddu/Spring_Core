package com.gk.bean;



import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
@Setter
public class Course {
private String cname;
private int cid;
@Autowired
private Calendar dos;

public Course() {
   System.out.println("Course.Course()");
}

@Override
public String toString() {
	return "Course [cname=" + cname + ", cid=" + cid + ", dos=" + dos + "]";
}

	

}
