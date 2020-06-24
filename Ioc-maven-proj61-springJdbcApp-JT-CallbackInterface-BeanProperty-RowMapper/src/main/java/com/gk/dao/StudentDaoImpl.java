package com.gk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gk.bo.StudentBo;


@Repository("dao")
public  class StudentDaoImpl implements StudentDao {
		public final static String  queryMap="SELECT * FROM STUDENT WHERE SNO=?";
		@Autowired
private JdbcTemplate jt;
public int count=0;

	@Override
	public StudentBo fetchRecord(int sid) {
		StudentBo bo1=null;
		 
		 bo1=jt.queryForObject(queryMap,new BeanPropertyRowMapper<StudentBo>(StudentBo.class), sid);
		return bo1;
	}
}
