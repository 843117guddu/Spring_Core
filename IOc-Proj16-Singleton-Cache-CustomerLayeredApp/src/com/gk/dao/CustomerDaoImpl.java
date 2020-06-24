package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.gk.bo.CustomerBo;
//make dao class as final because of no outr  class use it 

public  final class CustomerDaoImpl implements CustomerDao {
	private DataSource ds=null;
	private Connection con=null;
	private PreparedStatement ps=null;
	public static final  String query="INSERT INTO CUSTOMER VALUES(?,?,?,?)";

	public CustomerDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBo bo) throws Exception {
		//create connection using ds
		con=ds.getConnection();
		//create preparedstmt
		ps=con.prepareStatement(query);
		//set the value from the bo
		ps.setInt(1,bo.getcId());
		ps.setString(2,bo.getcName());
		ps.setString(3,bo.getcAdd());
		ps.setLong(4,bo.getcNumber());
		//excute the query
		int count=ps.executeUpdate();
		
		return count;
	}

}
