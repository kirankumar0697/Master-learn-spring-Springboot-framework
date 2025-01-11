package com.firstspringproject.learn_spring_framework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstspringproject.learn_spring_framework.game.GameRunner;
import com.firstspringproject.learn_spring_framework.game.MarioGame;
import com.firstspringproject.learn_spring_framework.game.PacManGame;
import com.firstspringproject.learn_spring_framework.game.SuperContraGame;

//Example for tight & loose coupling where we used interface to make tightly coupled code into loosely coupled.
public class App02HelloWorldSpring {

	public static void main(String[] args) {

		//Launch Spring context
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println("Hello " + context.getBean("name"));
			System.out.println("Your age is " + context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("person5Qualifier"));
		}
		
		
	} 

}
