package com.gk.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class EmployeeDetals {
	private  List<String> eName;
	private List<Integer> eAge;
	private Set<Long> eMob;
	private List<Date>eDoj;
	private List<Date>eDob;
	private Map<Long,String> eBankDetails;
}
