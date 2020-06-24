package com.gk.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gk.controller.MainController;
import com.gk.vo.CustomerVo;

public class CustomerAppTest {

	public static void main(String[] args) {
		// create bean factory
		BeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/gk/cfgs/applicationContext.xml"));
		//take input from the user and set to the vo
		Scanner sc=new Scanner(System.in);
		CustomerVo vo=new CustomerVo();
		System.out.println("Enter cid");
		vo.setcId(String.valueOf(sc.nextInt()));
		System.out.println("Enter cname");
	     vo.setcName(sc.next());
		System.out.println("Enter cAdd");
		vo.setcAdd(sc.next());
		System.out.println("Enter Contact numnber");
		vo.setcNumber(String.valueOf(sc.nextLong()));
		//create contoller class
		MainController controller=factory.getBean("controller",MainController.class);
		try {
			//call method
			String result=controller.handle(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
