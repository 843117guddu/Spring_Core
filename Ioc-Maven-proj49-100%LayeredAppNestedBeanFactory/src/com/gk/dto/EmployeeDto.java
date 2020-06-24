package com.gk.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeDto implements Serializable{
	private int eno;
	private String ename;
	private String eadd;
	private String dept;
	private String desig;
	float  salary;
	

}
