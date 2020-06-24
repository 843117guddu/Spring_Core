package com.gk.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerDto implements Serializable {
	private int cId;
	private String cName;
	private String cAdd;
	private long cNumber;
	
}
