package com.gk.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	public List<Map<String, Object>> fetchEmpsByDesgs(String[] desg) ;
}
