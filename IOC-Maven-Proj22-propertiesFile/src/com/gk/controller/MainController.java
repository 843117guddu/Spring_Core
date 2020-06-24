package com.gk.controller;

import java.util.List;

import com.gk.dto.EmployeeDto;
import com.gk.service.EmployeeService;
import com.gk.vo.EmployeeVo;

public class MainController {
	private EmployeeService service;

	public MainController(EmployeeService service) {
		
		this.service = service;
	}
public List<EmployeeDto> handle(String desig1,String desig2)throws Exception{
	List<EmployeeDto> listDto=service.register(desig1,desig2);
     return listDto;
}
}
