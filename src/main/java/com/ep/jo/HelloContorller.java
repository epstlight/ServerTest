package com.ep.jo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {
	
	public String hello() {
		return "hello";
	}
}
