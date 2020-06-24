package com.gk.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.gk.bean.Vechicle;



public class JavaConfigAnnotationTestApp {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		    Vechicle v=null;
		    Vechicle v1=null;
		     //create ioc contaner
		     ctx=new  ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		     //get bean object
		    v=ctx.getBean("vehicle",Vechicle.class);
		    System.out.println(v);
		    v.jounery("Patna", "Hyd");
		    v1=ctx.getBean("vehicle",Vechicle.class);
			System.out.println(v.hashCode()+"  "+v1.hashCode());		     
 ((AbstractApplicationContext) ctx).close();
 
	}

}
