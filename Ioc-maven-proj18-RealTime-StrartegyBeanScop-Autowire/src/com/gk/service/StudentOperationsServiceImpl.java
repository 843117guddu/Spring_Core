package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gk.bo.StudentBo;
import com.gk.dao.StudentDao;
import com.gk.dto.StudentDto;

public class StudentOperationsServiceImpl implements StudentOperationsService {
	@Autowired
private StudentDao dao;
	@Autowired
private StudentBo bo;
	public StudentOperationsServiceImpl(StudentDao dao, StudentBo bo) {

	this.dao = dao;
	this.bo = bo;
}
	
	@Override
	public String register(StudentDto dto) throws Exception {
		//write business logics by collecting inputs from dto;
		int sno=dto.getSno();
		String sname=dto.getSname();
		String sadd=dto.getSadd();
		int m1=dto.getM1();
		int m2=dto.getM2();
		int m3=dto.getM3();
		//write the logics for total and average;
		int total=m1+m2+m3;
		float avg=total/3;
		String result;
		if(m1<30||m2<30||m3<30) {
			result="FAIL";
			
		}
		else {
			result="PASS";
		}
		//prepare Bo class having sno,sname,sadd,total,avg,result
		
		
		bo.setSno(sno);
		System.out.println("SBo"+bo.getSno());
		bo.setSname(sname);
		bo.setSadd(sadd);
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		int count=dao.insert(bo);
		if(count==0) {
			return "Student Registration Fail";
			}
		else {
			return "Student Registration Successful";
		}
			
		
	
	}

}
