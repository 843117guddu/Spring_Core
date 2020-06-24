
  package com.gk.dao;
  
  import java.sql.ResultSet; 
  import java.sql.SQLException; 
   
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.jdbc.core.JdbcTemplate;
  import  org.springframework.jdbc.core.RowMapper;
  import org.springframework.stereotype.Repository;
  
  import com.gk.bo.StudentBo;
  
  
  @Repository("dao") 
  public class StudentDaoImpl implements StudentDao 
  { 
  
  public final static String queryMap="SELECT * FROM STUDENT WHERE SNO=?";
  
    @Autowired private JdbcTemplate jt; public int count=0;
  
  @Override public StudentBo fetchRecord(int sid)
  {
	 StudentBo bo=null;
  
  bo=jt.queryForObject(queryMap,new StudentRowMapper(), sid); 
  return bo; 
  }
  private static class StudentRowMapper implements RowMapper<StudentBo> {
  
  @Override
  public StudentBo mapRow(ResultSet rs, int rowNum) throws  SQLException { 
  StudentBo bo=new StudentBo(); 
  //copy the rs record to bo class
  bo.setSno(rs.getInt(1));
  bo.setSname(rs.getString(2));
  bo.setSadd(rs.getString(3));
  bo.setTotal(rs.getInt(4));
  bo.setAvg(rs.getFloat(5));
  bo.setResult(rs.getString(6)); 
  return bo; 
  }
  
  }
  }
  
 