package com.gk.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.bo.StudentBo;
import com.gk.dao.StudentDao;

@Service("service")
public class StudentOperationsServiceImpl implements StudentOperationsService {
       @Autowired
	private StudentDao dao;
		
	@Override
	public String mapRecord(int sid) {
		// use dao
		StudentBo bo=new StudentBo();
		bo=dao.fetchRecord(sid);
		String str=String.valueOf(bo);
		return str ;
	}
	
}

