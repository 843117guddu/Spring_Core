package com.gk.service;

import java.util.List;

import com.gk.bo.PassengerDetailsBo;
import com.gk.dto.PassengerDetailsDto;

public interface RailwayTicketReservationService {
	
	public String groupTicketReservation(List<PassengerDetailsDto> listDto);
}
