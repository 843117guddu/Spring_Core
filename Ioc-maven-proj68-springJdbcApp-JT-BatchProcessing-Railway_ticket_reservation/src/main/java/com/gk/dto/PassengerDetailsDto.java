package com.gk.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class PassengerDetailsDto implements Serializable {
	private String pname;
	private int  age;
	private String splace;
	private String dplace;
	private float price;
	private String gender;
}
