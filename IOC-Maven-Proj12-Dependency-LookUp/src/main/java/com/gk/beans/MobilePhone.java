package com.gk.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import lombok.Setter;
@Setter
public class MobilePhone {
	private String beanId;
	
	
	public void entertainment() {
		System.out.println("MobilePhone.Entertainment()");
	}

	public void gaming() {
		System.out.println("MobilePhone.Gaming()");
	}

	public void batteryCharging() {
		System.out.println("MobilePhone.batteryCharging()");
		System.out.println("<===========Depenency LookUp==========>");
		// create ioc contaner for dependent class
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		// get dependent bean
		MobilePhoneBatteryCharger charger = factory.getBean("mbCharger", MobilePhoneBatteryCharger.class);
		// depency lookup;

		charger.charging();

	}
	public void call() {
		System.out.println("MobilePhone.call()");
	}
	public void shopping() {
		System.out.println("MobilePhone.shopping()");
	}

	

	

}
