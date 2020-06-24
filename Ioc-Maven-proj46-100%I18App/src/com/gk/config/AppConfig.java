package com.gk.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.enclosing_method()");
	}
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	@Bean(name="msgSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource  rbms=null;
		rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com/gk/commons/App");
		return rbms;
	}
}
