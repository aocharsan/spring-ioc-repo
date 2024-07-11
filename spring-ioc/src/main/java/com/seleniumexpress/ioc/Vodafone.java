package com.seleniumexpress.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using vodafone sim");

	}

	@Override
	public void data() {
	System.out.println("Browsing internet using vodafone sim");

	}

}
