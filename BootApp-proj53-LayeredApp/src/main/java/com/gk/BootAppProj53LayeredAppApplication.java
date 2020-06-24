package com.gk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gk.controller.MainController;
import com.gk.dto.EmployeeDto;

@SpringBootApplication
public class BootAppProj53LayeredAppApplication {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=null;
		MainController container=null;
		cactx=SpringApplication.run(BootAppProj53LayeredAppApplication.class, args);
	     
		//get ioc container
		
		container=cactx.getBean("container",MainController.class);
		//call methodp
				try {
					List<EmployeeDto> listDto=container.handle("s/w engg","teacher");
				listDto.forEach(dto->{
					System.out.println(dto);
				});
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				cactx.close();
				
	}

}
