package com.gk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.beans.MobilePhone;
import com.gk.beans.MobilePhoneBatteryCharger;

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
		MobilePhone phone=factory.getBean("phone",MobilePhone.class);
		System.out.println("<===================================>");
		phone.entertainment();
		phone.gaming();
		phone.call();
		phone.shopping();
		System.out.println("=========================================");
		phone.batteryCharging(factory,"mobCharger" );
		
	}

}
