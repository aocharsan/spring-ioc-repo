package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	// @Required
	@Value("${student.name}")
	private String name;

	@Value("${student.course}")
	private String interestedCourse;

	@Value("${student.hobby}")
	private String hobby;

	/*
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public void setInterestedCourse(String interestedCourse) {
	 * this.interestedCourse = interestedCourse; }
	 * 
	 * public void setHobby(String hobby) { this.hobby = hobby; }
	 */

	public String getName() {
		return name;
	}

	public String getInterestedCourse() {
		return interestedCourse;
	}

	public String getHobby() {
		return hobby;
	}

	public void getStudentInfo() {
		System.out
				.println("Student [name=" + name + ", interestedCourse=" + interestedCourse + ", hobby=" + hobby + "]");
	}

}
