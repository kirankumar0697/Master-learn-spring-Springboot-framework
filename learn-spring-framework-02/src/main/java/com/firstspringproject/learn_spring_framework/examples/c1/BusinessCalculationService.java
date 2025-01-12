package com.firstspringproject.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
class BusinessCalculationService {
	
	@Autowired
	DataService dataService;

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	
	
}
