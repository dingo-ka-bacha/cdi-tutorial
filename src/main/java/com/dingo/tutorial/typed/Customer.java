package com.dingo.tutorial.typed;

import javax.inject.Inject;

import lombok.Getter;
import lombok.Setter;

public class Customer {
	@Inject
	@Getter @Setter
	CarService service;
}
