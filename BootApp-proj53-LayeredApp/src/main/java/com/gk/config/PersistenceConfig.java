package com.gk.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.lang.Nullable;

@Configuration
@PropertySource("com/gk/commons/jdbc.properties")
public class PersistenceConfig {
	@Value("${jdbc.driver}")
	@Nullable
	private String driver;
	@Value("${jdbc.url}")
	@Nullable
	private String url;
	@Value("${jdbc.user}")
	@Nullable
	private String user;
	@Value("${jdbc.pwd}")
	@Nullable
	private String pwd;
	@Value("${os.name}")
	@Nullable
	private String os;
	@Bean(name="ds")
	public DriverManagerDataSource createDMDS() {
		DriverManagerDataSource dmds=null;
		dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(driver);
		dmds.setUrl(url);
		dmds.setUsername(user);
		dmds.setPassword(pwd);
		System.out.println("OS Name::"+os);
		return dmds;
	}
	
	@Bean(name="jt")
	public JdbcTemplate createJt() {
		JdbcTemplate jt=null;
		jt= new JdbcTemplate((DataSource)this.createDMDS());
	return jt;
	}
	

}
