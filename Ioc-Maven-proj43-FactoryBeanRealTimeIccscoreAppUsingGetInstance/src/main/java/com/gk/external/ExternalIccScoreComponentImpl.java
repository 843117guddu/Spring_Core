package com.gk.external;

public class ExternalIccScoreComponentImpl implements ExternalIccScoreComponent {

	public ExternalIccScoreComponentImpl() {
		System.out.println("ExternalIccScoreComponentImpl.ExternalIccScoreComponentImpl()");
	}
	@Override
	public String getScore(int matchId) {
		System.out.println("ExternalIccScoreComponentImpl.getScore()");
		// write logic for score
		if(matchId==123)
		return "IND : 350/3";
		else if (matchId==345)
			return "BAN :150/4";
		else if(matchId==567)
			return "PAK 106/6";
		else 
			return "Not Valid Match Id";
	}

}
