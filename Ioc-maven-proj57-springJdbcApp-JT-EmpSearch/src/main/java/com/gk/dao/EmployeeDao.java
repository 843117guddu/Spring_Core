package com.gk.dao;

import java.util.List;
import java.util.Map;



public interface EmployeeDao {
	public  List<Map<String,Object>>  getEmpsByDesgs(String cond);

}
