package com.gk.vo;

import lombok.Data;
@Data
public class EmployeeVo {
	private String eno,ename,eadd,dept,desig,salary;

	public EmployeeVo() {
		System.out.println("EmployeeVo.EmployeeVo()");
	}
	
}
