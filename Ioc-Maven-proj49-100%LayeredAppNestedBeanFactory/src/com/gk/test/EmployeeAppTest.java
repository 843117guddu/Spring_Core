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
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.ResolvableType;

import com.gk.config.BusinessConfig;
import com.gk.config.PresentaionConfig;
import com.gk.controller.MainController;
import com.gk.dto.EmployeeDto;

public class EmployeeAppTest {

	public static void main(String[] args) {
		// create bean facory;
		ApplicationContext pctx=null,cctx=null;
		
		// create parent factory
		pctx=new AnnotationConfigApplicationContext(BusinessConfig.class);
		//create child container
		cctx=new AnnotationConfigApplicationContext(PresentaionConfig.class);
		//set parrent
		((AnnotationConfigApplicationContext)cctx).setParent(pctx);
	MainController controller=cctx.getBean("controller",MainController.class);
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
		
		
	((AbstractApplicationContext) cctx).close();
     ((AbstractApplicationContext) pctx).close();
	

	}

}
