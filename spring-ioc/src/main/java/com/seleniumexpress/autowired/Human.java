package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octpousHeart")  
	//Spring will directly create & inject object to the matched dependency. no Setter required.
	private Heart heart;

	public void setHeart(Heart heart) {
		System.out.println("setter mehod being called........");
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart !=null) {
			heart.pump();
			System.out.println(heart.getNameOfAnimal()+" has "+heart.getNoOfHearts()+" heart");
		}
		else {
			System.out.println("You are no longer alive !");
		}
	}

}
