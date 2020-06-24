package com.gk;

import java.io.PrintStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.gk.beans.WishApp;

@SpringBootApplication
public class BootAppProj51BasiccAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishApp wish=null;
		String msg=null;
		System.out.println("BootAppProj51BasiccAppApplication.main()");
		//get ioc container
		
		ctx=SpringApplication.run(BootAppProj51BasiccAppApplication.class, args);
	  System.out.println(ctx.getClass());
	  wish=ctx.getBean("wish",WishApp.class);
	msg=wish.generateWishMessage("Sudha");
	System.out.println(msg);
	((ConfigurableApplicationContext) ctx).close();
	}
	

}
