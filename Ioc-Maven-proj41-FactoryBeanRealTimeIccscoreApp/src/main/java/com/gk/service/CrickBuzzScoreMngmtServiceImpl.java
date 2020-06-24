package com.gk.service;

import com.gk.external.ExternalIccScoreComponentImpl;
import com.gk.locator.IccScoreComponentLocator;

public class CrickBuzzScoreMngmtServiceImpl implements CrickBuzzScoreMngmtService {
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
