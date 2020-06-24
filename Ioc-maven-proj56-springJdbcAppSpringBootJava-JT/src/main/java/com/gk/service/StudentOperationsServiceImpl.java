package com.gk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.dao.StudentDao;

@Service("service")
public class StudentOperationsServiceImpl implements StudentOperationsService {
	@Autowired
private StudentDao dao;
	public StudentOperationsServiceImpl(StudentDao dao) {
	System.out.println("StudentOperationsServiceImpl.StudentOperationsServiceImpl()");
	this.dao = dao;
}
	@Override
	public String countRecord()  {
		//use dao
		int count=dao.fetchCount();
		if(count!=0)
			return "Total No of Recorc   "+count;
		else
			return "Record Not Found";
	}
	@Override
	public Map<String, Object> mapRecord(int sid) {
		// use dao
		Map<String, Object> map=new HashMap<String, Object>();
		map=dao.fetchRecord(sid);
		
		return map ;
	}
	@Override
	public List<Map<String, Object>> listOfRecord() {
		 List<Map<String, Object>> list=null;
		 //use dao
		 list=dao.fetchListOfRecord();
		return list;
	}
	@Override
	public String insertRecord(int sno, String sname, String sadd, int m1, int m2, int m3) {
		// find total
		int total=0;
		total=m1+m2+m3;
		float avg=0.0f;
		avg=total/3;
		String result=null;
		if(m1<30||m2<30||m3<30)
			result="Fail";
		else
			result="Pass";
		//use dao
		int count=0;
		count=dao.insertRecord(sno, sname, sadd, total, avg, result);
		if(count!=0)
			return "Registration Successful";
		else 
			return "Registration Failed";
		
	}
	@Override
	public String updateRecord(int sno, String sname, int m1, int m2, int m3) {
	
		int total=0;
		float avg=0.0f;
		String result=null;
		int count=0;
		// find total
		total=m1+m2+m3;
		avg=total/3;
		if(m1<30||m2<30||m3<30)
			result="Fail";
		else 
			result="Pass";
		//use dao
		count=dao.updateRecord(sno, sname, total, avg, result);
		return count!=0?"Record Updated successfully":"Updatation fail";
		
	}
	@Override
	public String deleteRecord(int sno) {
		int count=0;
		// use dao
		count=dao.deletRecord(sno);
		return count!=0?"Record Deleted  successfully":"Delation fail";
	}

}
