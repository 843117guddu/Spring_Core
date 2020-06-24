package com.gk.service;

import com.gk.bo.CustomerBo;
import com.gk.dao.CustomerDao;
import com.gk.dto.CustomerDto;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;

	public CustomerServiceImpl(CustomerDao dao) {

		this.dao = dao;
	}

	@Override
	public String register(CustomerDto dto) throws Exception {
		// convert dto to bo;
		CustomerBo bo = new CustomerBo();
		bo.setcId(dto.getcId());
		bo.setcName(dto.getcName());
		bo.setcAdd(dto.getcAdd());
		bo.setcNumber(dto.getcNumber());
		// use dao
		int count = dao.insert(bo);
		
		if (count == 0) {

			return "Customer registration fail";
		} else {
			return "Customer registration succeeded";
		}

	}
}
