package com.gk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.beans.Car;

public class TestApp {

	public static void main(String[] args) {
		//Creating defaultbean factory
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		//create defaultlistablebeanfactory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//create bean factory
		System.out.println("<===============================>");
		Car cr=factory.getBean("GudduCar",Car.class);
		System.out.println(cr);
		System.out.println("<===============================>");
		Car cr1=factory.getBean("SudhaCar",Car.class);
		System.out.println(cr1);
		}

}
