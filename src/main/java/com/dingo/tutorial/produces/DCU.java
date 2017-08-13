package com.dingo.tutorial.produces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DCU implements Bank {

	public void withdrawal() {
		log.debug("You are withdrawing from dcu");
		
	}

	public void deposit() {
		log.debug("You are depositing in dcu");
		
	}

}
