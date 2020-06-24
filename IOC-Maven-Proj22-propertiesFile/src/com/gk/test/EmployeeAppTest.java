package com.gk.test;

import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;

import com.gk.controller.MainController;
import com.gk.dto.EmployeeDto;

public class EmployeeAppTest {

	public static void main(String[] args) {
		// create bean facory;
	
		ApplicationContext pFactory=null,cFactory=null;
		// create parent factory
		pFactory=new ClassPathXmlApplicationContext("com/gk/cfgs/businesstier-bean.xml");
		cFactory=new ClassPathXmlApplicationContext( new String []{"com/gk/cfgs/presentationtier-bean.xml"},pFactory);
		
		
		
	MainController controller=cFactory.getBean("controller",MainController.class);
		//call methodp
		try {
			List<EmployeeDto> listDto=controller.handle("s/w engg","teacher");
		listDto.forEach(dto->{
			System.out.println(dto);
		});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) pFactory).close();
		((AbstractApplicationContext) cFactory).close();
		
		System.out.println( System.getProperties());
		

	}

}
