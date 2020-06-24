package com.gk.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gk.controller.MainController;
import com.nt.vo.StudentVo;

public class RealTimeDiTest {

	public static void main(String[] args) {
		// create ioc container
		BeanFactory factory = null;
		// create bean factory
		factory = new XmlBeanFactory(new ClassPathResource("com/gk/cfgs/applicationContext.xml"));
		// Take input from the user
		Scanner sc = new Scanner(System.in);
       //inpute sno
		System.out.println(" input  SNo");
		int sno = sc.nextInt();
         //inpute sname
		System.out.println(" input  SName");
		String sName = sc.next();
        //inpute sAdd
		System.out.println(" input  SAdd");
		String sAdd = sc.next();
		
		
       //inpute m1
		System.out.println(" input  M1");
		int m1 = sc.nextInt();
        //inpute m2
		System.out.println(" input  M2");
		int m2 = sc.nextInt();
        //inpute m3
		System.out.println(" input  M3");
		int m3 = sc.nextInt();
      //take studentvo
		StudentVo vo = new StudentVo();
		vo.setSno(String.valueOf(sno));
		vo.setSname(sName);
		vo.setSadd(sAdd);
		vo.setM1(String.valueOf(m1));
		vo.setM2(String.valueOf(m2));
		vo.setM3(String.valueOf(m3));
		
        //get Controller class obect
		MainController controller = factory.getBean("controller", MainController.class);
        
		try {
			//invoke  method
			String result = controller.handle(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
