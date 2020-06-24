package com.gk.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.DataAccessException;

import com.gk.config.AppConfig;
import com.gk.controller.MainController;

public class RealTimeDiTest {

	public static void main(String[] args) {
		// create ioc container
		AnnotationConfigApplicationContext factory=null;
		// create bean factory
		factory = new AnnotationConfigApplicationContext(AppConfig.class);

		// get Controller class obect
		MainController controller = factory.getBean("controller", MainController.class);

		try {
			// invoke method
			String result = controller.fetchCount();
			System.out.println(result);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		System.out.println("............Record Map...............");
		try {
			// invoke method
			Map<String, Object> map = null;
			map = controller.fetchRecordMap(102);
			System.out.println(map);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		System.out.println("............List Record ...............");
		try {
			// invoke method
			List<Map<String, Object>> list = null;
			list = controller.fetchList();
			System.out.println(list);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	/*	System.out.println("............Insert Record ...............");
		try {
			// invoke method
			String result = null;
			result = controller.insert(106, "Renu", "Patna", 70, 78, 79);
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
*/
		System.out.println("............Update Record ...............");
		try {
			// invoke method
			String result = null;
			result = controller.update(107, "Rahul", 70, 78, 79);
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("............Delete Record ...............");
		try {
			// invoke method
			String result = null;
			result = controller.delete(104);
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

       factory.close();
	}

}
