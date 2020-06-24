
  package com.gk.dao;
  
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gk.bo.PassengerDetailsBo;
  @Repository("dao") 
  public class RailwayTicketReservationDaoImpl implements RailwayTicketReservationDao 
  { 
  
 private final static String batchQuery="INSERT INTO  RAILWAY_RESERVATION VALUES(TKID_SEQ.NEXTVAL,?,?,?,?,?,?)";
      @Autowired 
    private JdbcTemplate jt; 
	@Override
	public int[] batchInsert(List<PassengerDetailsBo> listBo) {
		int result[]=null;
		result=jt.batchUpdate(batchQuery,new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				System.out.println(
						"RailwayTicketReservationDaoImpl.batchInsert(...).new BatchPreparedStatementSetter() {...}.setValues()");
				ps.setString(1,listBo.get(i).getPname());
				ps.setInt(2, listBo.get(i).getAge());
				ps.setString(3, listBo.get(i).getSplace());
			    ps.setString(4,listBo.get(i).getDplace());
			    ps.setFloat(5,listBo.get(i).getPrice());
			    ps.setString(6,listBo.get(i).getGender());				
			}
			
			@Override
			public int getBatchSize() {
				System.out.println(
						"RailwayTicketReservationDaoImpl.batchInsert(...).new BatchPreparedStatementSetter() {...}.getBatchSize()");
			
				return listBo.size();
			}
		});
		return result;
	}
  
  
 }
  
 