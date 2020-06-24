package com.gk.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.gk.external.ExternalIccScoreComponentImpl;
//@Component
public class IccScoreComponentLocator  {

public static ExternalIccScoreComponentImpl getInstance() {
	System.out.println("IccScoreComponentLocator.getInstance()");
	//Actually here we should written jndi lookup code.. Since we have Extenal comp as
			// ordinary java class.. we are going create and return object manually
		
	return new ExternalIccScoreComponentImpl();
}

}
