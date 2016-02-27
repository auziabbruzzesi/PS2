package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void MyIntegertest(){
		assertTrue("is even",MyInteger.isEven(4));
		assertFalse("is even",MyInteger.isEven(5));
		assertTrue("is odd",MyInteger.isOdd(777));
		assertFalse("is odd",MyInteger.isOdd(778));
		assertTrue("is prime",MyInteger.isPrime(5));
	}
	
		
		
		
	
		
}


