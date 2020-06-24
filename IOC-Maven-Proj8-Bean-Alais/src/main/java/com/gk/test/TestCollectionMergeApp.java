package com.gk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.beans.EnggCourse;

public class TestCollectionMergeApp {

	public static void main(String[] args) {
		//take defaultlistablebeanfactory
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create object
		factory=new DefaultListableBeanFactory();
		//create xml bean definition
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//create bean class
		EnggCourse course=factory.getBean("1stSem",EnggCourse.class);
		System.out.println("<===================================>");
		System.out.println(course);
		//create 2nd bean
		EnggCourse course1=factory.getBean("2ndSem",EnggCourse.class);
		System.out.println("<===================================>");
		System.out.println(course1);
		
	}

}
