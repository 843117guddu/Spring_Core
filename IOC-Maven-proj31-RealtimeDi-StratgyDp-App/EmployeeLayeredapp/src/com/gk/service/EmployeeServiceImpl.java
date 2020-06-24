package com.gk.service;

import com.gk.bo.EmployeeBo;
import com.gk.dao.EmployeeDao;
import com.gk.dto.EmployeeDto;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao dao;
	public EmployeeServiceImpl(EmployeeDao dao) {
	
	this.dao = dao;
}
	@Override
	public String register(EmployeeDto dto) throws Exception {
		
		// prepared bo class
		
		EmployeeBo bo=new EmployeeBo();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setDept(dto.getDept());
		bo.setDesig(dto.getDesig());
		bo.setSalary(dto.getSalary()+0.1f*dto.getSalary()+0.2f*dto.getSalary()+0.3f*dto.getSalary());
		//use dao
		int count=dao.insert(bo);
		if(count==0) {
			return "Employee registration fail";
			
		}
		else {
			return "Employee registration succeeded";
		}
		
		
	}

}
