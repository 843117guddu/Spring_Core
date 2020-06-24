package com.gk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.dto.CustomerDto;
import com.gk.service.CustomerService;
import com.gk.vo.CustomerVo;
@Controller
public class MainController {
	@Autowired
private CustomerService service;

public MainController(CustomerService service) {
	this.service = service;
}
public String  handle(CustomerVo vo)throws Exception{
	//convert vo  to dto
	CustomerDto dto=new CustomerDto();
	dto.setCId(Integer.parseInt(vo.getCId()));
	dto.setCName(vo.getCName());
	
	dto.setCAdd(vo.getCAdd());
	dto.setCNumber(Long.parseLong(vo.getCNumber()));
	//use service
	return service.register(dto);
	
	
	
	
}
}
