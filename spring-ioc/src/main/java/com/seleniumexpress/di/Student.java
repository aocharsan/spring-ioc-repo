package com.seleniumexpress.di;

public class Student {

	private String name;
	private int rollno;
	private Cheat cheat;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void getCheat() {
		System.out.println("Student name is : " + name + " and roll no : " + rollno);
		this.cheat.cheating();
	}

}
