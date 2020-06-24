package com.gk.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import com.gk.dto.EmployeeDto;
import com.gk.service.EmployeeService;
import com.gk.vo.EmployeeVo;
@Controller("container")
@Lazy
public class MainController {
	@Autowired
	private EmployeeService service;

	public MainController(EmployeeService service) {
		
		this.service = service;
	}
public List<EmployeeDto> handle(String desig1,String desig2)throws Exception{
	List<EmployeeDto> listDto=service.register(desig1,desig2);
     return listDto;
}
}
