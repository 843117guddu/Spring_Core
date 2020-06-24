package com.gk.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.service.StudentOperationsService;

@Controller("controller")
public class MainController {
	@Autowired
	private StudentOperationsService service;

	public MainController(StudentOperationsService service) {
		this.service = service;
	}
	public String fetchCount(){
		//convert vo class object to Dto class object
		
		String result=service.countRecord();
		return result;
		
		
	}
	public Map<String,Object> fetchRecordMap(int sid){
		//convert vo class object to Dto class object
		Map<String,Object> map=new HashMap<String, Object>();
		
		map=service.mapRecord(sid);
		return map;
		
		
	} 
	public  List<Map<String, Object>> fetchList(){
		//use service
		return service.listOfRecord();
	}
	
	public String insert(int sno,String sname,String sadd,int m1,int m2,int m3) {
		//use service
		return service.insertRecord(sno, sname, sadd, m1, m2, m3);
	}
	public String update(int sno,String sname,int m1,int m2,int m3) {
		//use service
		return service.updateRecord(sno, sname, m1, m2, m3);
	}
  public  String delete(int Sno) {
  //use service
  return service.deleteRecord(Sno);
  }
}
