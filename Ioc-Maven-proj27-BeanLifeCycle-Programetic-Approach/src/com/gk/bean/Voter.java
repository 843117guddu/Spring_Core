package com.gk.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Setter;
@Setter
public class Voter implements InitializingBean,DisposableBean{
private String name,addrs;
private int age;
private Date dob;
	public Voter() {
         System.out.println("Voter.Voter()");
}
 
	public String checkVotingelgibility() {
		System.out.println("Voter.checkVotingelgibility()");
		if(age<18)
			return "Mr/Mrs/Miss "+name+" Uare not eligible for vote";
		else
			return "Mr/Mrs/Miss "+name+" U are eligible for vote";
		
	}
	public void myInit() {
	System.out.println("Voter.myInit()");
	//bean processing
	if(age<0) 
		age=age*-1;
		//verifying bean properties
		if(name==null||age<2)
			throw new IllegalArgumentException("Invalid age,name values");
		//initialize left over properties
		dob=new Date();
	}
	//custome destroy method
	public void myDestroy() {
	System.out.println("Voter.myDestroy()");;
		name=null;
		age=0;
		dob=null;
		addrs=null;
				
	
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", addrs=" + addrs + ", age=" + age + ", dob=" + dob + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter.afterPropertiesSet()");
		
		//bean processing
		if(age<0) 
			age=age*-1;
			//verifying bean properties
			if(name==null||age<2)
				throw new IllegalArgumentException("Invalid age,name values");
			//initialize left over properties
			dob=new Date();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Voter.destroy()");
		name=null;
		age=0;
		dob=null;
		addrs=null;
				
		
	}
	//create tostring 
	

}
