package com.gk.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
public int fetchCount();
public Map<String,Object> fetchRecord(int sid);
public  List<Map<String, Object>> fetchListOfRecord();
public int insertRecord(int sno,String sname,String sadd,int total,float avg,String result);
public int updateRecord(int sno,String sname,int total,float avg,String result);
public int deletRecord(int sno);
}
