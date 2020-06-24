
  package com.gk.dao;
  
  import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
  System.out.println("StudentDaoImpl.fetchRecord() :::::::Using Lambda Expression");
	listBo=jt.query(queryMap,(rs)->{ 
		  StudentBo bo=new StudentBo(); 
		  List<StudentBo> list=new ArrayList();
		  //copy the rs record to bo class
		  while(rs.next()) {
		  bo.setSno(rs.getInt(1));
		  bo.setSname(rs.getString(2));
		  bo.setSadd(rs.getString(3));
		  bo.setTotal(rs.getInt(4));
		  bo.setAvg(rs.getFloat(5));
		  bo.setResult(rs.getString(6)); 
		  list.add(bo);
		  }
		  return list; 
		  }, sadd); 
	
  return listBo; 
  }
 }
  
 