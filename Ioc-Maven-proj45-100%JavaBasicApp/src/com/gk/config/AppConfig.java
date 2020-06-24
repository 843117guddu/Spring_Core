package com.gk.config;



import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
@Configuration
@ComponentScan(basePackages ="com.gk.bean")
public class AppConfig {
	
	static {
		System.out.println("AppConfig.enclosing_method()");
	}
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	@Bean(name="cal")
	@Lazy
	public Calendar createCalendar() {
		System.out.println("AppConfig.createCalendar()");
		return Calendar.getInstance();
	}
}
