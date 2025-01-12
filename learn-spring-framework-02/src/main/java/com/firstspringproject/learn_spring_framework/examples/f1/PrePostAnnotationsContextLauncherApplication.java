package com.firstspringproject.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	
	SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		this.someDependency = someDependency;
		System.out.println("All Dependencies are ready!");
	}
	
	@PostConstruct
	public void intialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void clean() {
		System.out.println("All cleaned up!");
	}
}

@Component
class SomeDependency {
	
	public void getReady() {
		System.out.println("Some logic using");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
		}
	}

}
