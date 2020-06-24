
package com.gk.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gk.bo.StudentBo;

@Repository("dao")
public class StudentDaoImpl3rdLamda implements StudentDao {

	public final static String queryMap = "SELECT * FROM STUDENT WHERE SNO=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public StudentBo fetchRecord(int sid) {
		StudentBo bo1 = null;

		bo1 = jt.queryForObject(queryMap, (rs, index) -> {
			StudentBo bo = new StudentBo();
			// copy the rs record to bo class
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			bo.setTotal(rs.getInt(4));
			bo.setAvg(rs.getFloat(5));
			bo.setResult(rs.getString(6));
			return bo;

		}, sid);
		return bo1;
	}

}
