package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.gk.bo.EmployeeBo;

public class EmployeeDaoImpl implements EmployeeDao {
	private DataSource  ds=null;
	public Connection con=null;
	public PreparedStatement ps;
	
	//Create constructor with datasource as args
	public EmployeeDaoImpl(DataSource ds) {
		
		this.ds = ds;
	}

	public static String query="INSERT INTO  EMPLOYEE VALUES(?,?,?,?,?,?)";

	@Override
	public int insert(EmployeeBo bo) throws Exception {
		
		// generate datsource connection
		con=ds.getConnection();
		//create prepared stmt
		ps=con.prepareStatement(query);
		//set the value;
		ps.setInt(1, bo.getEno());
		ps.setString(2, bo.getEname());
		ps.setString(3,bo.getEadd());
		ps.setString(4,bo.getDept());
		ps.setString(5,bo.getDesig());
		ps.setFloat(6,bo.getSalary());
		//execute the querry
		int count=ps.executeUpdate();
		
		return count;
	}

}
