package com.gk.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.gk.dao")
public class PesistenceConfig {
	@Bean("ds")
	public DriverManagerDataSource createDMDS() {
		DriverManagerDataSource ds=null;
		ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("System");
		ds.setPassword("system");
		return ds;
	}
	
@Bean("jt")
public JdbcTemplate createJt() {
	JdbcTemplate jt=null;
	jt=new JdbcTemplate((DataSource)createDMDS());
	return jt;
}
}
