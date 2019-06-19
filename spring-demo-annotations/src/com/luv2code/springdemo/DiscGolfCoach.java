package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DiscGolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	return "Ace run or bust";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
