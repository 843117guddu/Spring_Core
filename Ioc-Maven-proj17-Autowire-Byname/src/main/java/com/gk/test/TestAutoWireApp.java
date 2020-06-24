package com.gk.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.autowire.TravelAgent;



public class TestAutoWireApp{

	public static void main(String[] args) {
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//create bean object using getBean method
		System.out.println("<=======Creating spring bean obeject using getbean factory method========>");
	TravelAgent tr=factory.getBean("agent",TravelAgent.class);
	System.out.println(tr.touring());
		
		
		}

}
