package com.gk.bean;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class DateFactoryBean implements FactoryBean<Date>{
private int year;
private int month;
private int day;

	public DateFactoryBean() {
		System.out.println("DateFactoryBean.DateFactoryBean()");
	}
	
	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		
		return new Date((year-1900),month-1,day);
	}
	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	
	}
@Override
	public boolean isSingleton() {
		System.out.println("======DateFactoryBean.isSingleton()====");
		System.out.println("Super Class=>"+super.getClass());
		return false;
	}
}
