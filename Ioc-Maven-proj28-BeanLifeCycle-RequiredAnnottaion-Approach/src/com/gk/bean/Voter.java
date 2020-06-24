package com.gk.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import lombok.Setter;

public class Voter {
private String name,addrs;
private int age;
private Date dob;

public Voter() {
    System.out.println("Voter.Voter()");
}
@Required
public void setName(String name) {
	System.out.println("Voter.setName()");
	this.name = name;
}
@Required
public void setAddrs(String addrs) {
	System.out.println("Voter.setAddrs()");
	this.addrs = addrs;
}
@Required
public void setAge(int age) {
	this.age = age;
}
@Required
public void setDob(Date dob) {
	this.dob = dob;
}
public String checkVotingelgibility() {
		System.out.println("Voter.checkVotingelgibility()");
		if(age<18)
			return "Mr/Mrs/Miss "+name+" Uare not eligible for vote";
		else
			return "Mr/Mrs/Miss "+name+" U are eligible for vote";
		
	}
@Override
public String toString() {
	return "Voter [name=" + name + ", addrs=" + addrs + ", age=" + age + ", dob=" + dob + "]";
}
	
	

}
