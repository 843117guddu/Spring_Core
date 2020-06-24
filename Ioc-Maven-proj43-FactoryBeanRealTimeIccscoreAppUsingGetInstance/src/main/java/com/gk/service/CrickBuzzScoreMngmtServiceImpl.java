package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.external.ExternalIccScoreComponentImpl;
import com.gk.locator.IccScoreComponentLocator;
@Service("service1")
public class CrickBuzzScoreMngmtServiceImpl implements CrickBuzzScoreMngmtService {
	@Autowired
	private ExternalIccScoreComponentImpl extComp;
	
	
	public CrickBuzzScoreMngmtServiceImpl(ExternalIccScoreComponentImpl extComp) {
		
		this.extComp = extComp;
	}


	@Override
	public String findScore(int matchId) throws Exception{
		//use locator
		System.out.println("================FindScore method==================");
		System.out.println(extComp.getScore(matchId));
		return extComp.getScore(matchId);
	}

}
