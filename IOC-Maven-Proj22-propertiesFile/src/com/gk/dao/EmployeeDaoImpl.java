package com.gk.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gk.bo.EmployeeBo;

import lombok.Data;
@Data
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private String os;
	private String javaVendor;
	private String pathVal;
	JdbcTemplate jt;
	public static String sQuery=" SELECT * FROM EMPLOYEE WHERE DESIG IN(?,?)";
	//create constructor using jdbc templet
	public EmployeeDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public List<EmployeeBo> fetch(String desig1,String desig2)  {
		//call query method
		
		System.out.println("system properties ::"+os +"    "+javaVendor+"         "+pathVal);
		
		List<EmployeeBo> listBo= jt.query(sQuery,rs->{
			List<EmployeeBo> listBo1=new ArrayList<EmployeeBo>();
			EmployeeBo bo= null;
					while(rs.next()) {
						bo=new EmployeeBo();
						bo.setEno(rs.getInt(1));
						bo.setEname(rs.getString(2));
						bo.setEadd(rs.getString(3));
						bo.setDept(rs.getString(4));
						bo.setDesig(rs.getString(5));
						
						bo.setSalary(rs.getFloat(6));
						listBo1.add(bo);
					}
			
			return listBo1;
		
		},desig1,desig2);
       return listBo;
	
	}
}
