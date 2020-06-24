package com.gk.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalProfile {
	private List<String> PName;
	private List<Integer> PAge;
	private Set<Long> Pmob;
	private Map<Long, String> PBankDetails;



	public PersonalProfile(List<String> pName, List<Integer> pAge, Set<Long> pmob, Map<Long, String> pBankDetails) {
	
		PName = pName;
		PAge = pAge;
		Pmob = pmob;
		PBankDetails = pBankDetails;
	}



	@Override
	public String toString() {
		return "PersonalProfile [PName=" + PName + ", PAge=" + PAge + ", Pmob=" + Pmob + ", PBankDetails="
				+ PBankDetails + "]";
	}
	
}
