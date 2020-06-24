package com.gk.test;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.ResolvableType;

import com.gk.controller.MainController;
import com.gk.dto.EmployeeDto;

public class EmployeeAppTest {

	public static void main(String[] args) {
		// create bean facory;
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		// create parent factory
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/gk/cfgs/businesstier-bean.xml");
		
		//create child factory
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader= new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/gk/cfgs/presentationtier-bean.xml");
		
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
		
		
		

	}

}
