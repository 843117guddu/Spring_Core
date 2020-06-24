package com.gk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.bo.StudentBo;
import com.gk.dto.StudentDto;
import com.gk.service.StudentOperationsService;

@Controller("controller")
public class MainController {
	@Autowired
	private StudentOperationsService service;

	
	public StudentDto fetchRecordMap(int sid){
		
		
		//use service
		
		StudentDto result=service.mapRecord(sid);
		return result;
		
		
	} 
	
}
