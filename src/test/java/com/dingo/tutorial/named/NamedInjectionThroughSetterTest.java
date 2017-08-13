package com.dingo.tutorial.named;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.named.AutoService;
import com.dingo.tutorial.named.BMWAutoService;
import com.dingo.tutorial.named.FordAutoService;

@RunWith(WeldJUnit4Runner.class)
public class NamedInjectionThroughSetterTest {

	private AutoService bmwAutoService;

	private AutoService fordAutoService;

	@Inject
	public void setBmwAutoService(@Named("bmwAutoService") AutoService bmwAutoService) {
		this.bmwAutoService = bmwAutoService;
	}

	@Inject
	public void setFordAutoService(@Named("fordAutoService") AutoService fordAutoService) {
		this.fordAutoService = fordAutoService;
	}

	@Test
	public void instanceCheck() {
		assertEquals(bmwAutoService.getClass(), BMWAutoService.class);
		assertEquals(fordAutoService.getClass(), FordAutoService.class);
	}
}
