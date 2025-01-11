package com.firstspringproject.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstspringproject.learn_spring_framework.game.GameRunner;
import com.firstspringproject.learn_spring_framework.game.GamingConsole;
import com.firstspringproject.learn_spring_framework.game.MarioGame;
import com.firstspringproject.learn_spring_framework.game.PacManGame;
import com.firstspringproject.learn_spring_framework.game.SuperContraGame;

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
