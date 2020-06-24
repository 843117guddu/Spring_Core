package com.gk.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	private int cId;
	private String cName;
	private String cAdd;
	private long cNumber;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAdd() {
		return cAdd;
	}
	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}
	public long getcNumber() {
		return cNumber;
	}
	public void setcNumber(long cNumber) {
		this.cNumber = cNumber;
	}
	

}
