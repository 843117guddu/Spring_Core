package com.gk.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Webcontainer{
	public abstract RequestHandler getHandler();
	 public void processRequest(String data) {
		 RequestHandler rh=null;
		 System.out.println("Webcontainer recived request having data::"+data+"  for processsing---->"+this.hashCode());
	    rh=getHandler();
		rh.handle(data);
	 }
	

}
