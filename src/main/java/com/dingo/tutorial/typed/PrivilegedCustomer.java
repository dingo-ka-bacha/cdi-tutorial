package com.dingo.tutorial.typed;

import javax.inject.Inject;

import lombok.Getter;
import lombok.Setter;

public class PrivilegedCustomer {
	@Inject
	@Getter @Setter
	PrivilegedCarService service;

}
