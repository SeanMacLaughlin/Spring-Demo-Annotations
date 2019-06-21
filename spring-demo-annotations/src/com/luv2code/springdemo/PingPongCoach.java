package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	
	private FortuneService fortuneService;
	
	// define a default constructor
	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
	
	@Autowired
	public PingPongCoach(@Qualifier("randomFortuneService")
			FortuneService theFortuneService) {
		System.out.println(">> PingPongCoach: inside constructor using @autowired and @qualifier");
		
		fortuneService = theFortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your ping pong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
