package com.gk.dao;

import java.util.List;

import com.gk.bo.PassengerDetailsBo;

public interface RailwayTicketReservationDao {

public int[] batchInsert(final List<PassengerDetailsBo> listBo);

}
