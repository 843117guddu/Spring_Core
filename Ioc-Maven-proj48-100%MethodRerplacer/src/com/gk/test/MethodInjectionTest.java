package com.gk.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.BankService;
import com.gk.config.AppConfig;
public class MethodInjectionTest {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		    BankService service=null;
		     //create ioc contaner
		     ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
		     //get bean object
		    service=ctx.getBean("bank",BankService.class);
		    System.out.println(service.getClass()+"------->"+service.getClass().getSuperclass());
		    //invoke method
		    System.out.println(service.calcInterestAmount(100000,10));
		   
            ((AbstractApplicationContext) ctx).close();
	}

}
