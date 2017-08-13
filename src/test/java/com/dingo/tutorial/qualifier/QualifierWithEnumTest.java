package com.dingo.tutorial.qualifier;

import static com.dingo.tutorial.qualifier.AutoType.Ford;
import static com.dingo.tutorial.qualifier.AutoType.Honda;
import static com.dingo.tutorial.qualifier.AutoType.Toyota;
import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.qualifier.Auto;
import com.dingo.tutorial.qualifier.AutoService;
import com.dingo.tutorial.qualifier.FordAutoService;
import com.dingo.tutorial.qualifier.HondaAutoService;
import com.dingo.tutorial.qualifier.ToyotaAutoService;

@RunWith(WeldJUnit4Runner.class)
public class QualifierWithEnumTest {
	
	@Inject
	@Auto(Ford)
	private AutoService fordAutoService;
	 
	@Inject
	@Auto(Honda)
    private AutoService hondaAutoService;

    @Inject
    @Auto(Toyota)
    private AutoService toyotaAutoService;

	@Test
	public void instanceCheck() {
		assertEquals(fordAutoService.getClass(), FordAutoService.class);
		assertEquals(hondaAutoService.getClass(), HondaAutoService.class);
		assertEquals(toyotaAutoService.getClass(), ToyotaAutoService.class);
	}
}
