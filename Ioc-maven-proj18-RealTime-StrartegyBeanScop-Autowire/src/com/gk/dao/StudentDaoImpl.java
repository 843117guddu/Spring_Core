package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.gk.bo.StudentBo;

public final  class StudentDaoImpl implements StudentDao {
	public final static String  query="INSERT INTO STUDENT  VALUES(?,?,?,?,?,?)";
	@Autowired
DataSource ds=null;;
Connection con=null;
PreparedStatement  ps=null;
public int count=0;
	public StudentDaoImpl(DataSource ds) {
	this.ds = ds;
}
	@Override
	public int insert(StudentBo bo) throws Exception {
		//call get connection method of 
		con=ds.getConnection();
		//create prepared statement
		ps=con.prepareStatement(query);
		System.out.println("bo.getSno"+bo.getSno());
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setString(3,bo.getSadd());
		ps.setInt(4, bo.getTotal());
		ps.setFloat(5,bo.getAvg());
		ps.setString(6, bo.getResult());
		//execute the prepared statement
		count=ps.executeUpdate();
				
		return count;
	}

}
