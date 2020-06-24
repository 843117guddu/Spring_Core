package com.gk.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;

import com.gk.controller.MainController;
import com.gk.vo.EmployeeVo;

public class EmployeeAppTest {

	public static void main(String[] args) {
		// create bean facory;
		BeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/gk/cfgs/applicationContext.xml"));
		// take input from the user and set to the vo
		Scanner sc=new Scanner(System.in);
		
		EmployeeVo vo=new EmployeeVo();
		//take eno
		System.out.println("Enter Eno"); 
		vo.setEno(String.valueOf(sc.nextInt()));
		//take ename
		System.out.println("Enter EName"); 
		sc.next();
		vo.setEname(sc.nextLine());
		
		//take edd
		System.out.println("Enter EAdd"); 
		vo.setEadd(sc.nextLine());
		//take dept
		System.out.println("Enter EDept"); 
		vo.setDept(sc.nextLine());
		//take dept
		System.out.println("Enter Edesig"); 
		vo.setDesig(sc.nextLine());
		//take salary
		System.out.println("Enter ESalalry"); 
		vo.setSalary(String.valueOf(sc.nextFloat()));
		// get controller
		MainController controller=factory.getBean("controller",MainController.class);
		//call method
		try {
		String result=controller.handle(vo);
		System.out.println(result); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
