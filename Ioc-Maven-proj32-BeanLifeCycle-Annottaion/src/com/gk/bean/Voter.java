package com.gk.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
@Named("voter")
public class Voter {
@Value("${voter.name}")
private String name;
@Value("${voter.addrs}")
private String addrs;
@Value("${voter.age}")
private int age;
private Date dob;

public Voter() {
    System.out.println("Voter.Voter()");
}

public void setName(@NonNull String name) {
	System.out.println("Voter.setName()");
	this.name = name;
}

public void setAddrs(@NonNull String addrs) {
	System.out.println("Voter.setAddrs()");
	this.addrs = addrs;
}

public void setAge(int age) {
	this.age = age;
}

public void setDob(Date dob) {
	this.dob = dob;
}
public @NonNull String checkVotingelgibility() {
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
	

//Custom Init method
@PostConstruct
public  void  myInit(){
	System.out.println("Voter.myInit()");
	//bean processing 
	 if(age<0)
		 age=age*-1;
	 
	//verifying bean properties....
	if(name==null || name.length()==0 || age<2)
		throw new IllegalArgumentException("Invalid age,name values ");
	//initialize left over properites
	  dob=new Date();
	  
	  
}

//custom destroy method
@PreDestroy
public void myDestroy() {
	System.out.println("Voter.myDestroy()");
	name=null;
	age=0;
	dob=null;
	addrs=null;
}


}
