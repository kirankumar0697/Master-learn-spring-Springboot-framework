package com.firstspringproject.learn_spring_framework.game;

public class GameRunner {
	
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {

		System.out.println("Hello, You are in game.");
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
