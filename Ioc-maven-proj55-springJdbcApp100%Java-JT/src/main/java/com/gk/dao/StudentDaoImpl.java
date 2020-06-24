package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("dao")
public final  class StudentDaoImpl implements StudentDao {
	public final static String  query="SELECT COUNT(*) FROM STUDENT";
	public final static String  queryMap="SELECT * FROM STUDENT WHERE SNO=?";
	public final  static String queryList="SELECT * FROM STUDENT";
	public final static String insertQuery="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	public final static String updateQuery="UPDATE STUDENT SET SNO=?,TOTAL=?,AVG=?,RESULT=? WHERE SNAME=?";
	public final static String deleteQuery="DELETE  FROM STUDENT WHERE SNO=?";
@Autowired
private JdbcTemplate jt;
public int count=0;
	public StudentDaoImpl(JdbcTemplate jt) {
	this.jt =jt;
}
	@Override
	public int fetchCount()  {
		int count=0;
		count=jt.queryForObject(query, Integer.class);
		return count;
	}
	@Override
	public Map<String, Object> fetchRecord(int sid) {
		 Map<String, Object> map=null;
		 map=jt.queryForMap(queryMap, sid);
		return map;
	}
	@Override
	public List<Map<String, Object>> fetchListOfRecord() {
		
		 List<Map<String, Object>> list=null;
		 list=jt.queryForList(queryList);
		return list;
	}
	@Override
	public int insertRecord(int sno, String sname, String sadd, int total, float avg, String result) {
		
		return jt.update(insertQuery, sno,sname,sadd,total,avg,result);
	}
	@Override
	public int updateRecord(int sno, String sname, int total, float avg, String result) {
		
		return jt.update(updateQuery, sno,total,avg,result,sname);
	}
	@Override
	public int deletRecord(int sno) {
		
		return jt.update(deleteQuery,sno);
	}
	
}
