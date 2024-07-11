package com.seleniumexpress.annotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
	System.out.println("Hello, I'm your science teacher : Rahul Mande");
		
	}

}
