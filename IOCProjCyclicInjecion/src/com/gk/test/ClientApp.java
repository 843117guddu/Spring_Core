package com.gk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gk.beans.A;

public class ClientApp {

	public static void main(String[] args) {
BeanFactory factory=null;
		//create bean factory
factory=new XmlBeanFactory(new ClassPathResource("com/gk/cfgs/applicationContext.xml"));
A a=factory.getBean("a",A.class);
	}

}
