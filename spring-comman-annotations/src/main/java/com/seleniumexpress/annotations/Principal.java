package com.seleniumexpress.annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void getPrincipalInfo() {
		System.out.println("hello , I'm your principal : James Bond");
	}
	
}
