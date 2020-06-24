package com.gk.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalProfile {
	private List<String> PName;
	private List<Integer> PAge;
	private Set<Long> Pmob;
	private Map<Long, String> PBankDetails;

	public PersonalProfile() {
		System.out.println("PersonalProfile.PersonalProfile()");
	}

	public void setPName(List<String> pName) {
		PName = pName;
	}

	public void setPAge(List<Integer> pAge) {
		PAge = pAge;
	}

	public void setPmob(Set<Long> pmob) {
		Pmob = pmob;
	}

	public void setPBankDetails(Map<Long, String> pBankDetails) {
		PBankDetails = pBankDetails;
	}

	@Override
	public String toString() {
		return "PersonalProfile [PName=" + PName + ", PAge=" + PAge + ", Pmob=" + Pmob + ", PBankDetails="
				+ PBankDetails + "]";
	}
	
}
