package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("configuration file loaded successfully....");
		Student sanket = context.getBean("student", Student.class);
		
	  /*	
	  String[] allBeans = context.getBeanDefinitionNames();
		for (String str : allBeans) {
			System.out.println(str);
		}    */

		sanket.getCheat();

	}
}
