package com.gk.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.gk.bean.Voter;



public class BeanLifeCycleDeclarativeAppUsingBf{

	public static void main(String[] args) {
		     DefaultListableBeanFactory factory=null;
		     XmlBeanDefinitionReader reader=null;
		     
		     Voter voter=null;
		     //create ioc contaner
		     factory=new  DefaultListableBeanFactory();
		     reader=new  XmlBeanDefinitionReader(factory);
		     reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		     //get bean object
		     voter=factory.getBean("voter",Voter.class);
		     System.out.println(voter);
		     System.out.println(voter.checkVotingelgibility());

	}
	

}
