package com.gk.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.gk.controller.MainController;
import com.gk.vo.CustomerVo;

public class RealtimStratgyAppTest {

	public static void main(String[] args) {
		// create bean factory
		ApplicationContext ctx=null;
		
		ctx=new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		//take input from the user and set to the vo
		Scanner sc=new Scanner(System.in);
		CustomerVo vo=new CustomerVo();
		System.out.println("Enter cid");
		vo.setCId(String.valueOf(sc.nextInt()));
		System.out.println("Enter cname");
	     vo.setCName(sc.next());
		System.out.println("Enter cAdd");
		vo.setCAdd(sc.next());
		System.out.println("Enter Contact numnber");
		vo.setCNumber(String.valueOf(sc.nextLong()));
		//create contoller class
		MainController controller=ctx.getBean("controller",MainController.class);
		try {
			//call method
			String result=controller.handle(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
((AbstractApplicationContext) ctx).close();
	}

}
