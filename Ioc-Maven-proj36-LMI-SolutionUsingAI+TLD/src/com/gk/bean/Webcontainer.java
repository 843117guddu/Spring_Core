package com.gk.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Webcontainer implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx;
	
	
	
	public Webcontainer(String beanId) {
		System.out.println("Webcontainer.Webcontainer()::1-pram constructor");
	 this.beanId=beanId;
	}
	 public void prcessRequest(String data) {
		 System.out.println("Webcontainer recived request having data::"+data+"  for processsing---->"+this.hashCode());
	    RequestHandler	rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handle(data);
	 }
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Webcontainer.setApplicationContext()");
		this.ctx=ctx;
	}

}
