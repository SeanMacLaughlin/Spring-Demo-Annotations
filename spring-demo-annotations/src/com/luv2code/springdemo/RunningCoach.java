package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class RunningCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.preserve}")
	private String preserve;
	
	@Value("${foo.shoes}")
	private String shoes;
	
	public RunningCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Go hit the trails";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getPreserve() {
		return preserve;
	}

	public String getShoes() {
		return shoes;
	}
	
	

}
