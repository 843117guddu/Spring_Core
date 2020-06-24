package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.bo.CustomerBo;
import com.gk.dao.CustomerDao;
import com.gk.dto.CustomerDto;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao dao;

	public CustomerServiceImpl(CustomerDao dao) {

		this.dao = dao;
	}

	@Override
	public String register(CustomerDto dto) throws Exception {
		// convert dto to bo;
		CustomerBo bo = new CustomerBo();
		bo.setCId(dto.getCId());
		bo.setCName(dto.getCName());
		bo.setCAdd(dto.getCAdd());
		bo.setCNumber(dto.getCNumber());
		// use dao
		int count = dao.insert(bo);
		
		if (count == 0) {

			return "Customer registration fail";
		} else {
			return "Customer registration succeeded";
		}

	}
}
