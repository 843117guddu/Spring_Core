package com.gk.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.beans.Student;



public class TestPandCNamespaceApp{

	public static void main(String[] args) {
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//create bean object using getBean method
		System.out.println("<=======Creating spring bean obeject using getbean factory method========>");
	Student tr=factory.getBean("std",Student.class);
	System.out.println(tr);
		
		
		}

}
