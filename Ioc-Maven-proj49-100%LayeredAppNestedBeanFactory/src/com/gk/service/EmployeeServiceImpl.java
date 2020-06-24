package com.gk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.bo.EmployeeBo;
import com.gk.dao.EmployeeDao;
import com.gk.dto.EmployeeDto;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
private static final ArrayList<EmployeeDto> EmployeeDto = null;
@Autowired
private EmployeeDao dao;
		@Override
	public List<EmployeeDto> register(String desig1,String desig2) throws Exception {
		List<EmployeeDto> listDto=new ArrayList<EmployeeDto>();
		// prepared bo class
		List<EmployeeBo> listBo=new ArrayList<EmployeeBo>();
		EmployeeBo bo=new EmployeeBo();
	
		//use dao
		listBo=dao.fetch(desig1,desig2);
		//comvert bo to dto
		listBo.forEach(bo1->{
			EmployeeDto dto=new EmployeeDto();
			BeanUtils.copyProperties(bo1,dto);
			listDto.add(dto);
					
			
		});
		return listDto;
		
		
	}

}
