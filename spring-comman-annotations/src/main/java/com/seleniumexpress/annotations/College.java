package com.seleniumexpress.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	@Value("${college.name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	/*
	   public College(Principal principal) { this.principal = principal; }


	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}  	 */

	public void test() {
		principal.getPrincipalInfo();
		teacher.teach();
		System.out.println("College name : "+this.collegeName);
		System.out.println("Testing this method successfully------");

	}

}
