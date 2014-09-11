package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private ATM atm;
	
	@Before
	public void setUp() throws Exception {
		atm = new ATM (10);	
	}

	@After
	public void tearDown() throws Exception {
		
	}


	@Test
	public void getBalanceTest() {
		
		assertEquals(atm.getBalance(), 10, .2f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void depositTest(){
		atm.deposit(-1.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void witdrawTest(){
		atm.withdraw(-1.0);
	}
	
	@Test
	public void toStringTest() {
		
		assertEquals("Amount balance is $10.00",atm.toString() );
	}

}