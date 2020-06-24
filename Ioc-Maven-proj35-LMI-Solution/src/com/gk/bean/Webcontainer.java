package com.gk.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Webcontainer {
	private String beanId;
	
	
	public Webcontainer(String beanId) {
		System.out.println("Webcontainer.Webcontainer()::1-pram constructor");
	 this.beanId=beanId;
	}
	 public void prcessRequest(String data) {
		 ApplicationContext ctx=null;
		System.out.println("Webcontainer recived request having data::"+data+"  for processsing---->"+this.hashCode());
	//extract container for dependency lookup
		ctx=new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		//perform dependency lookup
	RequestHandler	rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handle(data);
	 }

}
