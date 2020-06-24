package com.gk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gk.beans.PersonProfile;

public class TestCollectionMergeApp {

	public static void main(String[] args) {
		//take Ac container using file system xml applicationContextCo
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/gk/cfgs/applicationContext.xml");
		// create ioc container using class path
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		//create bean
		PersonProfile pf=ctx.getBean("pProfile",PersonProfile.class);
		System.out.println(pf);
		System.out.println("======================");
		PersonProfile pf1=ctx.getBean("sProfile",PersonProfile.class);
		System.out.println(pf1);
		((AbstractApplicationContext) ctx).close();
		
	}

}
