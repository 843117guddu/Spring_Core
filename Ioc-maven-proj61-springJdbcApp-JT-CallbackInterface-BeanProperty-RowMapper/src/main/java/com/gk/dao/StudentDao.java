package com.gk.dao;

import com.gk.bo.StudentBo;

public interface StudentDao {

public StudentBo fetchRecord(int sid);

}
/*
 * public int fetchCount();
 * public List<Map<String, Object>> fetchListOfRecord(); public int
 * insertRecord(int sno,String sname,String sadd,int total,float avg,String
 * result); public int updateRecord(int sno,String sname,int total,float
 * avg,String result); public int deletRecord(int sno);
 */