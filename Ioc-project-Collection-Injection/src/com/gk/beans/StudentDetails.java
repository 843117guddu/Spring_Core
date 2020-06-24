package com.gk.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StudentDetails {

	private int marks[];
	private List<String> Sname;

	public StudentDetails() {
		System.out.println("StudentDetails.StudentDetails()");
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setSname(List<String> sname) {
		Sname = sname;
	}

	@Override
	public String toString() {
		return "StudentDetails [marks=" + Arrays.toString(marks) + ", Sname=" + Sname + "]";
	}

}
