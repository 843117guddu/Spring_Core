package com.gk.controller;

import com.gk.dto.StudentDto;
import com.gk.service.StudentOperationsService;
import com.gk.vo.StudentVo;

public class MainController {
	private StudentOperationsService service;
	private StudentDto dto;

	public MainController(StudentOperationsService service, StudentDto dto) {
		super();
		this.service = service;
		this.dto = dto;
	}
	public String handle(StudentVo vo)throws Exception{
		//convert vo class object to Dto class object
		//StudentDto dto=new StudentDto();
		System.out.println("value of vo.getSno)"+Integer.parseInt(vo.getSno()));
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		System.out.println("Value of vo.getM3() "+vo.getM3());
		dto.setM3(Integer.parseInt(vo.getM3()));
		//user service
		String result=service.register(dto);
		return result;
		
		
	}

}
