package com.gk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gk.bean.Webcontainer;

@SpringBootApplication
public class BootAppProj52Lmi1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cpctx=null;
		Webcontainer container=null;
		//create container
		cpctx=SpringApplication.run(BootAppProj52Lmi1Application.class, args);
		//create bean
		container=cpctx.getBean("container",Webcontainer.class);
		System.out.println("..............Hi Guddu......................");
		container.processRequest("Corona Treatment");
		cpctx.close();
	}

}
