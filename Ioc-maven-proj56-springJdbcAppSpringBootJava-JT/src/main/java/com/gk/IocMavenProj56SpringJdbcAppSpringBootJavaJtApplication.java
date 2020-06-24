package com.gk;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;

import com.gk.controller.MainController;


@SpringBootApplication
public class IocMavenProj56SpringJdbcAppSpringBootJavaJtApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext factory=null;
			
		// create ioc container
			
				// create bean factory
				factory =(AnnotationConfigApplicationContext) SpringApplication.run(IocMavenProj56SpringJdbcAppSpringBootJavaJtApplication.class, args);


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
