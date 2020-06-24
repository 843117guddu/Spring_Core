package com.gk.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gk.bean.DateFactoryBean;

@Configuration
@ComponentScan(basePackages ="com.gk.bean")
public class AppConfig {
	
	@Bean(name="dt")
	public DateFactoryBean createDateFactoryBean() {
		DateFactoryBean factory=null;
		factory=new DateFactoryBean();
		factory.setYear(2020);
		factory.setDay(23);
		factory.setMonth(5);
		return factory;
	}

}
