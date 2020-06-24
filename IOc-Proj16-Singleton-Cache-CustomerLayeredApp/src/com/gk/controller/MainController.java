package com.gk.controller;

import com.gk.dto.CustomerDto;
import com.gk.service.CustomerService;
import com.gk.vo.CustomerVo;

public class MainController {
private CustomerService service;

public MainController(CustomerService service) {
	this.service = service;
}
public String  handle(CustomerVo vo)throws Exception{
	//convert vo  to dto
	CustomerDto dto=new CustomerDto();
	dto.setcId(Integer.parseInt(vo.getcId()));
	dto.setcName(vo.getcName());
	
	dto.setcAdd(vo.getcAdd());
	dto.setcNumber(Long.parseLong(vo.getcNumber()));
	//use service
	return service.register(dto);
	
	
	
	
}
}
