package com.gk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.beans.EmployeeDetals;
import com.gk.beans.StudentDetails;

public class TestApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=null;
		
		XmlBeanDefinitionReader reader=null;
		//creaate object of default listable bean
		factory=new DefaultListableBeanFactory();
		//create xmlbean definition bean
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//get bean
		StudentDetails std=factory.getBean(StudentDetails.class);
		System.out.println("TestApp.main()");
		System.out.println("<=====================================>");
		System.out.println(std);
		System.out.println("<=====================================>");
		System.out.println("EmployeeDetails");
		System.out.println("<=====================================>");
           //get employee bean
		EmployeeDetals ed=factory.getBean("com.gk.beans.EmployeeDetals#0",EmployeeDetals.class);
		EmployeeDetals ed1=factory.getBean("com.gk.beans.EmployeeDetals#1",EmployeeDetals.class);
		System.out.println(ed);
		System.out.println("<=====================================>");
		System.out.println(ed1);
		
	}

}
