package com.anil.jobs.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	private static final Logger logger=Logger.getLogger(Test.class.getName());
	
	@GetMapping("test/{userName}")
	public String getUserName(@PathVariable("userName") String userName){
		logger.info(userName);
		return "Hi "+userName;
	}
}
