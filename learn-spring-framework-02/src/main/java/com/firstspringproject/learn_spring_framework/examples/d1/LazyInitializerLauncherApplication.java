package com.firstspringproject.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Constructor Initialized...");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Doing Something...");
	}
}

@Configuration
@ComponentScan
public class LazyInitializerLauncherApplication {
	
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(LazyInitializerLauncherApplication.class)) {
			System.out.println("Context created...");
			context.getBean(ClassB.class).doSomething();			
		}
	}

}
