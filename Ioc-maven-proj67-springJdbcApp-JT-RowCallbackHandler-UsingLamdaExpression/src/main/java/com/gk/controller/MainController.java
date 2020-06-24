package com.gk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.dto.StudentDto;
import com.gk.service.StudentOperationsService;

@Controller("controller")
public class MainController {
	@Autowired
	private StudentOperationsService service;

	
	public List<StudentDto> fetchRecordMap(String sadd){
		
		List<StudentDto> listDto=null;
		//use service
		
		listDto=service.mapRecord(sadd);
		return listDto;
		
		
	} 
	
}
