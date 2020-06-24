package com.gk.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class StudentDto implements Serializable {
	private int sno;
	private String sname;
	private String sadd;
	private int total;
	private float avg;
	private String result;

}
