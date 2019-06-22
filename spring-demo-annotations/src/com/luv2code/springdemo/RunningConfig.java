package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class RunningConfig {
	
	// define bean for our running fortune service
	@Bean
	public FortuneService runningFortuneService() {
		return new RunningFortuneService();
	}
	
	
	// define bean for our running coach AND inject dependency
	@Bean
	public Coach runningCoach() {
		return new RunningCoach(runningFortuneService());
	}

}
