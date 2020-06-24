package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.gk.controller.MainController;
import com.gk.dto.StudentDto;

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
		StudentDto dto= null;
			dto = controller.fetchRecordMap(103);
			System.out.println(dto);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) factory).close();
	}

}
