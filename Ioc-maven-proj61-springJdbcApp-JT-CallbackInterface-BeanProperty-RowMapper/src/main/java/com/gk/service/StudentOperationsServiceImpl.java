package com.gk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.bo.StudentBo;
import com.gk.dao.StudentDao;
import com.gk.dto.StudentDto;

@Service("service")
public class StudentOperationsServiceImpl implements StudentOperationsService {
	@Autowired
	private StudentDao dao;

	@Override
	public StudentDto mapRecord(int sid) {
		// use dao
		StudentBo bo = null;
		StudentDto dto = new StudentDto();
		bo = dao.fetchRecord(sid);
		// convert bo to dto
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
