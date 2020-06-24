package com.gk.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MobilePhone implements ApplicationContextAware {
private String beanId;
private ApplicationContext ctx;
 public MobilePhone() {
	 System.out.println("MobilePhone.MobilePhone()");
}
	public void setBeanId(String beanId) {
	System.out.println("MobilePhone.setBeanId()");
		this.beanId = beanId;
}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("MobilePhone.setApplicationContext()");
		this.ctx=ctx;

	}
//business method
	public void gaming() {
		System.out.println("MobilePhone.gaming()");
	}
	public void shoping() {
		System.out.println("MobilePhone.shoping()");
	}
	public void entertainment() {
		System.out.println("MobilePhone.entertainment()");
	}
	public void calls() {
		System.out.println("MobilePhone.calls()");
	}
	public void batteryCharging() {
		System.out.println("MobilePhone.batteryCharging()");
		MobilePhoneBatteryCharger charger=ctx.getBean(beanId,MobilePhoneBatteryCharger.class);
		//invoke method
		charger.charging();
	}
	@Override
	public String toString() {
		return "MobilePhone [beanId=" + beanId + ", ctx=" + ctx + "]";
	}
	
}
