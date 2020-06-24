package com.gk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gk.beans.CollegeDetails;
import com.gk.beans.FruitsStore;
import com.gk.beans.PersonalProfile;
import com.gk.beans.StudentDetails;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory=null;

factory=new XmlBeanFactory(new ClassPathResource("com/gk/cfgs/applicationContext.xml"));
//get Student class
StudentDetails sdt=factory.getBean("stDetails", StudentDetails.class);
System.out.println(sdt);
System.out.println("<==========================================>");
//get clg details
CollegeDetails clgdt=factory.getBean("clgDetails",CollegeDetails.class);
System.out.println(clgdt);
System.out.println("<==========================================>");
//creates pdetails;
PersonalProfile pf=factory.getBean("pDtails",PersonalProfile.class);
System.out.println(pf);
System.out.println("<==========================================>");
//create fdetails
FruitsStore fs=factory.getBean("fDetails",FruitsStore.class);
System.out.println(fs);
	}

}
