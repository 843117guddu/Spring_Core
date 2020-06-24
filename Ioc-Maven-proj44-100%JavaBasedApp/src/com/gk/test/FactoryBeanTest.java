package com.gk.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.DateFactoryBean;
import com.gk.bean.ScheduleRemainder;
import com.gk.config.AppConfig;
public class FactoryBeanTest {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		    ScheduleRemainder remainder=null;
		     //create ioc contaner
		     ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
		     //get bean object
		    remainder=ctx.getBean("remainder",ScheduleRemainder.class);
		    System.out.println("-------------------------hi--------------------");
		  //  System.out.println(remainder.getClass()+"------->"+remainder.getClass().getSuperclass());
		    //invoke method
		    System.out.println(remainder);
		    System.out.println("...........................");
		 System.out.println(remainder.remaiderOfTheDay());
		   Object obj=ctx.getBean("dt",Object.class);
		   System.out.println(obj);
            ((AbstractApplicationContext) ctx).close();
	}

}
