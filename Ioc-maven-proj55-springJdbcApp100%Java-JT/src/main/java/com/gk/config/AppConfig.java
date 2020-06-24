package com.gk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PesistenceConfig.class,ServiceConfig.class,ControllerCongig.class})
public class AppConfig {

}
