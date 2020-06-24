package com.gk.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.Webcontainer;
import com.gk.config.AppConfig;



public class LmiApp {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		    Webcontainer webContainer=null;
		     //create ioc contaner
		     ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		     //get bean object
		    webContainer=ctx.getBean("container",Webcontainer.class);
		     //invoke method
		    webContainer.processRequest("Corona patient");
		    System.out.println("------------------------------");
		    webContainer.processRequest("Corona treatment");
		    System.out.println("------------------------------");
              
		    webContainer.processRequest("Corona hospital");
		   
              
		  
		    ((AbstractApplicationContext) ctx).close();
	}

}
