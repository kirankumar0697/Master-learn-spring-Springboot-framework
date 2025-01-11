package com.firstspringproject.learn_spring_framework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Zoro";
	}
	
	@Bean
	public int age() {
		return 18;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Luffy", 16, new Address("Main street", "London"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3Quelifier") Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		var address = new Address("Love street", "Doublin");
		return address;
	}
	
	@Bean(name="address3")
	@Qualifier("address3Quelifier")
	public Address address3() {
		var address = new Address("Sakinaka", "Japan");
		return address;
	}
}
