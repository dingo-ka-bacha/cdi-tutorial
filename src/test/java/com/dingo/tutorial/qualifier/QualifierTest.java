package com.dingo.tutorial.qualifier;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.qualifier.AutoService;
import com.dingo.tutorial.qualifier.Ford;
import com.dingo.tutorial.qualifier.FordAutoService;
import com.dingo.tutorial.qualifier.Honda;
import com.dingo.tutorial.qualifier.HondaAutoService;
import com.dingo.tutorial.qualifier.Toyota;
import com.dingo.tutorial.qualifier.ToyotaAutoService;

@RunWith(WeldJUnit4Runner.class)
public class QualifierTest {
	
	@Inject
	@Ford
	private AutoService fordAutoService;
	 
	@Inject
    @Honda
    private AutoService hondaAutoService;

    @Inject
    @Toyota
    private AutoService toyotaAutoService;

	@Test
	public void instanceCheck() {
		assertEquals(fordAutoService.getClass(), FordAutoService.class);
		assertEquals(hondaAutoService.getClass(), HondaAutoService.class);
		assertEquals(toyotaAutoService.getClass(), ToyotaAutoService.class);
	}
}
