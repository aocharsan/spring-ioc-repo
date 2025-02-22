package com.seleniumexpress.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.annotations")
@PropertySource(value="classpath:college-info.properties")
public class CollegeConfig {

	/*@Bean
	public Teacher teacherBean() {
		return new MathTeacher();
	}
	
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
   @Bean
	public College collegeBean() {
		College college= new College();
		college.setPrincipal(principalBean());
		college.setTeacher(teacherBean());
		return college;
	}    */ 
	
}
