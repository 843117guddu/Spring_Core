package com.gk.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import lombok.Setter;
@Setter
public class MobilePhone {
	private String beanId;
	public MobilePhone() {
		System.out.println("MobilePhone.MobilePhone()");;
	}
	
	public void entertainment() {
		System.out.println("MobilePhone.Entertainment()");
	}

	public void gaming() {
		System.out.println("MobilePhone.Gaming()");
	}

	public void batteryCharging(BeanFactory factory, String beanId ) {
		System.out.println("MobilePhone.batteryCharging()");
		System.out.println("<===========Depenency LookUp==========>");
		// get dependent bean
		MobilePhoneBatteryCharger charger = factory.getBean(beanId, MobilePhoneBatteryCharger.class);
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
