package com.dingo.tutorial.typed;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.typed.CarService;
import com.dingo.tutorial.typed.Customer;
import com.dingo.tutorial.typed.PrivilegedCarService;
import com.dingo.tutorial.typed.PrivilegedCustomer;

@RunWith(WeldJUnit4Runner.class)
public class TypedTest {
	@Inject
	Customer customer;

	@Inject
	PrivilegedCustomer privilegedCustomer;

	@Test
	public void instanceCheck() {
		assertEquals(customer.getService().getClass(), CarService.class);
		assertEquals(privilegedCustomer.getService().getClass(), PrivilegedCarService.class);
	}
}
