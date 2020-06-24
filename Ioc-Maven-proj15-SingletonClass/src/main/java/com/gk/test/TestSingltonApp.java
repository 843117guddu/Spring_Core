package com.gk.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.gk.singleton.Airthmetic;
import com.gk.singleton.CalculateAreaOfCircle;
import com.gk.singleton.Printer;

public class TestSingltonApp{

	public static void main(String[] args) {
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/gk/cfgs/applicationContext.xml");
		//create bean object using getBean method
		System.out.println("<=======Creating spring bean obeject using getbean factory method========>");
		Printer pr=factory.getBean("printer",Printer.class);
		Printer pr1=factory.getBean("printer",Printer.class);
		System.out.println("<====pr===>"+pr);
		System.out.println("<====pr1===>"+pr1);
		System.out.println("pr.hashCode()"+pr.hashCode());
		System.out.println("pr2.hashCode()"+pr1.hashCode());
		
		
		System.out.println("<=========Creating normal singleton class beject =============>");
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		System.out.println("p1"+p1+"==== ::p2==="+p2);
		System.out.println("P1==p2?"+(p1==p2));
		System.out.println("p1.hashCode()"+p1.hashCode());
		System.out.println("======================");
		System.out.println("p2.hashCode()"+p2.hashCode());
		
		System.out.println("p1.hashCode()==p2.hashCode()"+(p1.hashCode()==p2.hashCode()));
		p1.getMessage("hello");
		p2.getMessage("Hai");
		
		
		System.out.println("<=======Creating spring bean obeject using getbean factory method========>");
		Airthmetic ar=factory.getBean("air",Airthmetic.class);
		Airthmetic ar1=factory.getBean("air",Airthmetic.class);
		System.out.println("ar.hashCode()"+ar.hashCode());
		System.out.println("ar1.hashCode()"+ar1.hashCode());

		
		
		System.out.println("<=========Creating normal singleton class beject =============>");
		//example of singlton class empty state 
		Airthmetic a1=Airthmetic.getInstance();
		Airthmetic a2=Airthmetic.getInstance();
		System.out.println("a1"+a1+"==== ::a2==="+a2);
		System.out.println("a1==a2"+(a1==a1));
		System.out.println("a1.hashCode()"+a2.hashCode());
		System.out.println("a1.hashCode()==a2.hashCode()"+(a1.hashCode()==a2.hashCode()));
		a1.add(6,7);
		a2.add(4,5);
		
		// example of singleton  class in read only state
		
		
		System.out.println("<=======Creating spring bean obeject using getbean factory method========>");
		CalculateAreaOfCircle cr=factory.getBean("area",CalculateAreaOfCircle.class);
		CalculateAreaOfCircle cr1=factory.getBean("area",CalculateAreaOfCircle.class);
		System.out.println("cr.hashCode()"+cr.hashCode());
		System.out.println("cr1.hashCode()"+cr1.hashCode());

		System.out.println("<=========Creating normal singleton class beject =============>");
		
		CalculateAreaOfCircle c1=CalculateAreaOfCircle.getInstance();
		CalculateAreaOfCircle c2=CalculateAreaOfCircle.getInstance();
		System.out.println("c1"+c1+"==== ::c2==="+c2);
		System.out.println("c1==c2"+(c1==c1));
		System.out.println("c1.hashCode()"+c2.hashCode());
		System.out.println("c1.hashCode()==c2.hashCode()"+(c1.hashCode()==c2.hashCode()));
		c1.calcArea(3);
		c2.calcArea(5);
		}

}
