package com.firstspringproject.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.firstspringproject.learn_spring_framework.game")
public class GamingAppLauncherApplication {
	
	/*
	 * @Bean public GameRunner gameRunner(GamingConsole game) {
	 * System.out.println("Param: "+ game); var gameRunner = new GameRunner(game);
	 * return gameRunner; }
	 */
	
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			
			context.getBean(GameRunner.class).run();
		}
	}

}