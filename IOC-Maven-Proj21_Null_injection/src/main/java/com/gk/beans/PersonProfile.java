package com.gk.beans;

import java.util.Date;

import lombok.Setter;

public class PersonProfile {
	
private long aNo;
private String name;
private float age;
private Date dob, doj,dom;
public PersonProfile(long aNo, String name, float age, Date dob, Date doj, Date dom) {
	System.out.println("PersonProfile.6-pram constructor");
	this.aNo = aNo;
	this.name = name;
	this.age = age;
	this.dob = dob;
	this.doj = doj;
	this.dom = dom;
}
@Override
public String toString() {
	return "PersonProfile [aNo=" + aNo + ", name=" + name + ", age=" + age + ", dob=" + dob + ", doj=" + doj + ", dom="
			+ dom + "]";
}

}
