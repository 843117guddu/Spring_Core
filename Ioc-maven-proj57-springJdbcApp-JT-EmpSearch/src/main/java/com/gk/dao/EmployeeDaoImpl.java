package com.gk.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public List<Map<String, Object>> getEmpsByDesgs(String cond) {
		System.out.println("EmployeeDaoImpl.getEmpsByDesgs()");
		List<java.util.Map<String,Object>> list=null;
		list=jt.queryForList("SELECT * FROM EMPLOYEE WHERE DESIG IN"+cond+"ORDER BY DESIG",new Object[] {} );
		return list;
	}

}
