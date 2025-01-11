package com.firstspringproject.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Mario Up");
	}
	
	public void down() {
		System.out.println("Mario Down");
	}
	
	public void right() {
		System.out.println("Mario Right");
	}
	
	public void left() {
		System.out.println("Mario Left");
	}
}
