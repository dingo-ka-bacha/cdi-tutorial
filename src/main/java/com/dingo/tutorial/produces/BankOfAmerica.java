package com.dingo.tutorial.produces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOfAmerica implements Bank {

	public void withdrawal() {
		log.debug("You are withdrawing from bank of america");
		
	}

	public void deposit() {
		log.debug("You are depositing in bank of america");
		
	}

}
