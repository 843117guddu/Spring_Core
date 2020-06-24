package com.gk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages ="com.gk.replacer")
@ImportResource(locations = "com/gk/cfgs/applicationContext.xml")

public class AppConfig {

}
