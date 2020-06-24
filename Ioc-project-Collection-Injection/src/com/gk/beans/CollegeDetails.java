package com.gk.beans;

import java.util.Map;
import java.util.Set;

public class CollegeDetails {
	private Set<String> ClgName=null;
	private Map<Integer,String> deptName;
	public CollegeDetails() {
		System.out.println("CollegeDetails.CollegeDetails()");
	}
	public void setClgName(Set<String> clgName) {
		ClgName = clgName;
	}
	public void setDeptName(Map<Integer, String> deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "CollegeDetails [ClgName=" + ClgName + ", deptName=" + deptName + "]";
	}

}
