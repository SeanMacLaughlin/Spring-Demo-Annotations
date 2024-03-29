package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunningJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(RunningConfig.class);
		
		// get the bean from spring container
		RunningCoach theCoach = context.getBean("runningCoach", RunningCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
//		System.out.println("email: " + theCoach.getEmail());
//		System.out.println("team: " + theCoach.getTeam());

		
		// close the context
		context.close();
		
	}

}
