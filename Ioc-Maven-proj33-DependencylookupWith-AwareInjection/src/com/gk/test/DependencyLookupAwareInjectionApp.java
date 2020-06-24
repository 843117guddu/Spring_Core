package com.gk.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.MobilePhone;
import com.gk.bean.MobilePhoneBatteryCharger;



public class DependencyLookupAwareInjectionApp {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		     MobilePhone mobilePhone=null;
		     //create ioc contaner
		     System.out.println("1st IOc Container");
		     
		     ctx=new  ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		     // target  bean object
		     mobilePhone=ctx.getBean("phone",MobilePhone.class);
		     //invoke method
		     mobilePhone.batteryCharging();
		     System.out.println("=========Other business method=============");
		     mobilePhone.entertainment();
		     mobilePhone.gaming();
		     mobilePhone.setApplicationContext(ctx);
		     System.out.println(mobilePhone);
 ((AbstractApplicationContext) ctx).close();
	}

}
