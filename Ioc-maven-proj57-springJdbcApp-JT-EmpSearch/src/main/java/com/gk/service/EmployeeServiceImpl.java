package com.gk.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.dao.EmployeeDao;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
private EmployeeDao dao;
		@Override
	public List<Map<String, Object>> fetchEmpsByDesgs(String[] desg) {
		StringBuffer sb=null;
		String cond=null;
		List<Map<String, Object>> list=null;
		sb=new StringBuffer("(");
		for(int i=0; i<desg.length;++i) {
			if(i==desg.length-1)
				sb.append("'"+desg[i]+"')");
			else 
				sb.append("'"+desg[i]+"',");
		}
		//conver to string
		cond=sb.toString();
		//use dao
		System.out.println("EmployeeServiceImpl.fetchEmpsByDesgs()");
		list=dao.getEmpsByDesgs(cond);
	
		return list;
	}

}
