package com.firstspringproject.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContra Up");
	}
	
	public void down() {
		System.out.println("SuperContra Down");
	}
	
	public void right() {
		System.out.println("SuperContra Right");
	}
	
	public void left() {
		System.out.println("SuperContra Left");
	}
}
