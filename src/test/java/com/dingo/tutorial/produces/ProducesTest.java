package com.dingo.tutorial.produces;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dingo.test.weld.WeldJUnit4Runner;
import com.dingo.tutorial.produces.Bank;
import com.dingo.tutorial.produces.BankName;
import com.dingo.tutorial.produces.BankOfAmerica;
import com.dingo.tutorial.produces.BankProducer;
import com.dingo.tutorial.produces.BankType;
import com.dingo.tutorial.produces.Chase;


@RunWith(WeldJUnit4Runner.class)
public class ProducesTest {
	@Inject
	@BankProducer
	@BankType(BankName.BankOfAmerica)
	private Bank bankOfAmerica;
	
	@Inject
	@BankProducer
	@BankType(BankName.Chase)
	private Bank chaseBank;
	
	@Test
	public void create() {
		assertEquals(bankOfAmerica.getClass(), BankOfAmerica.class);
		assertEquals(chaseBank.getClass(), Chase.class);
	}
}
