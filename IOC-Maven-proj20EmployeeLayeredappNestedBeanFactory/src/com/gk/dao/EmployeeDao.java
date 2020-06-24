package com.gk.dao;

import java.util.List;

import com.gk.bo.EmployeeBo;

public interface EmployeeDao {
	public List<EmployeeBo> fetch(String desig1,String desig2);
}
