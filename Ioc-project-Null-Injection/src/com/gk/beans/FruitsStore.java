package com.gk.beans;

import java.util.Properties;

public class FruitsStore {
	private Properties Fname;

	public FruitsStore() {
		System.out.println("FruitsStore.FruitsStore()");
	}

	public void setFname(Properties fname) {
		Fname = fname;
	}

	@Override
	public String toString() {
		return "FruitsStore [Fname=" + Fname + "]";
	}
	

}
