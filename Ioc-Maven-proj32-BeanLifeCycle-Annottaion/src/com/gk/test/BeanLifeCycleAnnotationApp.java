package com.gk.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.Voter;



public class BeanLifeCycleAnnotationApp {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		     Voter voter=null;
		     //create ioc contaner
		     ctx=new  ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		     //get bean object
		     voter=ctx.getBean("voter",Voter.class);
		     System.out.println(voter);
		     System.out.println(voter.checkVotingelgibility());
 ((AbstractApplicationContext) ctx).close();
	}

}
