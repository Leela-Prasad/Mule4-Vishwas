package com.test.spring;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String sayHello() {
		return "Hello World!!!";
	}
	
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
