package com.dingo.tutorial.produces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chase implements Bank {

	public void withdrawal() {
		log.debug("You are withdrawing from chase");
		
	}

	public void deposit() {
		log.debug("You are depositing in chase");
		
	}

}
