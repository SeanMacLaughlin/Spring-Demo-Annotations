package com.luv2code.springdemo;

public class RadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a rad day!";
	}

}
