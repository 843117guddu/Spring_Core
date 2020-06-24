package com.gk.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.gk.external.ExternalIccScoreComponentImpl;
@Component("locator")
public class IccScoreComponentLocator implements FactoryBean<ExternalIccScoreComponentImpl> {

	@Override
	public ExternalIccScoreComponentImpl getObject() throws Exception {
		System.out.println("IccScoreComponentLocator.getObject()");
		
		return new ExternalIccScoreComponentImpl() ;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("IccScoreComponentLocator.getObjectType()");
		return ExternalIccScoreComponentImpl.class;
	}
	@Override
	public boolean isSingleton() {
		System.out.println("IccScoreComponentLocator.isSingleton()");
		// TODO Auto-generated method stub
		return true;
	}

}
