package com.gk.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="cal")
	public Calendar createCalender() {
		Calendar cal=null;
		System.out.println("AppConfig.createCalender()");
		cal=Calendar.getInstance();
		return cal;
	}

}
