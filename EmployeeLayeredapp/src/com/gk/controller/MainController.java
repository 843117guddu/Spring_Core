package com.gk.controller;

import com.gk.dto.EmployeeDto;
import com.gk.service.EmployeeService;
import com.gk.vo.EmployeeVo;

public class MainController {
	private EmployeeService service;

	public MainController(EmployeeService service) {
		
		this.service = service;
	}
public String handle(EmployeeVo vo)throws Exception{
	//convert vo class object to dto
	EmployeeDto dto=new EmployeeDto();
	//set value to dto
	dto.setEno(Integer.parseInt(vo.getEno()));
	dto.setEname(vo.getEname());
	dto.setEadd(vo.getEadd());
	dto.setDesig(vo.getDesig());
	dto.setDept(vo.getDept());
	dto.setSalary(Float.parseFloat(vo.getSalary()));
	//use service
	
String result=service.register(dto);
return result;
}
}
