
  package com.gk.dao;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.gk.bo.StudentBo;
  
  
  @Repository("dao") 
  public class StudentDaoImpl implements StudentDao 
  { 
  
  public final static String queryMap="SELECT * FROM STUDENT WHERE SADD=?";
  
    @Autowired private JdbcTemplate jt; public int count=0;
  
  @Override public List<StudentBo> fetchRecord(String sadd)
  {
	List<StudentBo> listBo=null;
  System.out.println("StudentDaoImpl.fetchRecord() :::::::BeanPropertyResultSetExtractor");
	listBo=(List<StudentBo>) jt.query(queryMap,new RowMapperResultSetExtractor<StudentBo>(new BeanPropertyRowMapper<StudentBo>(StudentBo.class) ),sadd); 
	
  return listBo; 
  }
 }
  
 