package com.dingo.tutorial.produces;

public enum BankName {

	DCU(DCU.class), Chase(Chase.class), BankOfAmerica(BankOfAmerica.class);

	private Class<? extends Bank> bankType;

	private BankName(Class<? extends Bank> bankType) {
		this.bankType = bankType;
	}

	public Class<? extends Bank> getBankType() {
		return bankType;
	}
}
