package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishService {

	@Autowired
	private WishServiceHelper helper;
	
	public String wish() {
		return helper.greet();
	}
	
	
}
