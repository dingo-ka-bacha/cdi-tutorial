package com.dingo.tutorial.named;

import javax.inject.Inject;
import javax.inject.Named;

import com.dingo.tutorial.named.AutoService;

import lombok.Getter;

public class AutoServiceCallerImpl {
	@Getter
	private AutoService bmwAutoService;
	
	@Getter
	private AutoService fordAutoService;

	@Inject
	public AutoServiceCallerImpl(@Named("bmwAutoService") AutoService bmwAutoService,
			@Named("fordAutoService") AutoService fordAutoService) {
		this.bmwAutoService = bmwAutoService;
		this.fordAutoService = fordAutoService;
	}
}
