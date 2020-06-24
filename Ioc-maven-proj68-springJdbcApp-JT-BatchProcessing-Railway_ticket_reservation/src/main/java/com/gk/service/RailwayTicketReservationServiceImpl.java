package com.gk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.bo.PassengerDetailsBo;
import com.gk.dao.RailwayTicketReservationDao;
import com.gk.dto.PassengerDetailsDto;

@Service("service")
public class RailwayTicketReservationServiceImpl implements RailwayTicketReservationService {
       @Autowired
	private RailwayTicketReservationDao dao;

	@Override
	public String groupTicketReservation(List<PassengerDetailsDto> listDto) {
		int result[]=null;
		//use dao
		List<PassengerDetailsBo> listbo=new ArrayList<PassengerDetailsBo>();
		//convert dto to bo
		listDto.forEach(dto->{
			PassengerDetailsBo bo=new PassengerDetailsBo();
			BeanUtils.copyProperties(dto, bo);
			listbo.add(bo);
		});
		//use dao
		result=dao.batchInsert(listbo);
		
		return (result!=null)?"Group reservation succeeded":"Group reservation failed";
	}
		

	
}

