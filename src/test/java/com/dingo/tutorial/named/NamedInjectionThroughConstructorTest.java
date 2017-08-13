package com.dingo.tutorial.named;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.named.BMWAutoService;
import com.dingo.tutorial.named.FordAutoService;

@RunWith(WeldJUnit4Runner.class)
public class NamedInjectionThroughConstructorTest {

	@Inject
	private AutoServiceCallerImpl autoServiceCallerImpl;

	@Test
	public void instanceCheck() {
		assertEquals(autoServiceCallerImpl.getBmwAutoService().getClass(), BMWAutoService.class);
		assertEquals(autoServiceCallerImpl.getFordAutoService().getClass(), FordAutoService.class);
	}
}
