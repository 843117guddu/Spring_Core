package com.gk.service;

import java.util.List;
import java.util.Map;

public interface StudentOperationsService {
	public String countRecord() ;
	public Map<String,Object> mapRecord(int sid);
	public List<Map<String,Object>> listOfRecord();
	public String  insertRecord(int sno,String sname,String sadd,int m1,int m2,int m3);
	public String updateRecord(int  sno,String sname,int m1,int m2,int m3);
	public String deleteRecord(int sno);
}
