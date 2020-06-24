package com.gk.service;

import java.util.ArrayList;
import java.util.List;

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
	public List<StudentDto> mapRecord(String sadd) {
		
		List<StudentBo> listBo=null;
		List<StudentDto> listDto=new ArrayList<StudentDto>();
		listBo=dao.fetchRecord(sadd);
		//convert bo to dto
	
		listBo.forEach( bo1->{
			StudentDto dto=new StudentDto();
			BeanUtils.copyProperties(bo1, dto);
			listDto.add(dto);
			});
				return listDto ;
	}
	
}

