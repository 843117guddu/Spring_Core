package com.gk.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.bean.Course;
import com.gk.bean.Student;



public class AnnotationTestApp {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		     Student st=null;
		     //create ioc contaner
		     ctx=new  ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		     //get bean object
		    st=ctx.getBean("st",Student.class);
		     System.out.println(st);
		     
 ((AbstractApplicationContext) ctx).close();
	}

}
