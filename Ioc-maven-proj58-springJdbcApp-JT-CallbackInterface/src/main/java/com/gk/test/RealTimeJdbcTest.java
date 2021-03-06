package com.gk.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.DataAccessException;

import com.gk.controller.MainController;

public class RealTimeJdbcTest {

	public static void main(String[] args) {
		// create ioc container
		ApplicationContext  factory = null;
		// create bean factory
		factory = new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");

		// get Controller class obect
		MainController controller = factory.getBean("controller", MainController.class);

		
		try {
			// invoke method
		String str = null;
			str = controller.fetchRecordMap(103);
			System.out.println(str);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
				((AbstractApplicationContext) factory).close();
	}

}
