package com.gk.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gk.bean.WishMessageGenerator;
import com.gk.config.AppConfig;
public class BasicInjectionTest {

	public static void main(String[] args) {
		     ApplicationContext ctx=null;
		   WishMessageGenerator generator=null;
		     //create ioc contaner
		     ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
		     //get bean object
		    generator=ctx.getBean("wmg",WishMessageGenerator.class);
		    System.out.println("-------------------------hi--------------------");
		  //  System.out.println(remainder.getClass()+"------->"+remainder.getClass().getSuperclass());
		    //invoke method
		    System.out.println(generator);
		    System.out.println("...........................");
		 System.out.println(generator.genratedWishMessage("Sudha"));
		  
            ((AbstractApplicationContext) ctx).close();
	}

}
