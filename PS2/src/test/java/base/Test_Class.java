package base;
import static org.junit.Assert.*;


import org.junit.Test;


public class Test_Class {

	MyInteger value = new MyInteger(5);
	MyInteger value1 = new MyInteger(21);

	@Test
	public void test2(){//tests for isEven(), isOdd(), and isPrime()
		assertFalse("is even",value.isEven());
		assertTrue("is odd",value.isOdd());
		assertTrue("is prime,value",value.isPrime());
		//tests object value2 which is equal to 21
		assertFalse("is prime",value1.isPrime());
	}

	@Test
	public void test3(){//tests for isEven1(), isOdd1(), and isPrime1()
		assertFalse("isEven1",MyInteger.isEven1(value.getiValue()));
		assertTrue("isOdd1",MyInteger.isOdd1(value.getiValue()));
		assertTrue("isPrime1",MyInteger.isPrime1(value.getiValue()));
		assertFalse("isPrime1",MyInteger.isPrime1(value1.getiValue()));
		
	}

	@Test
	public void test4(){//tests for the equals functions
		assertTrue("equalsint",value.equalsint(5));
		assertFalse("eqralsint",value.equalsint(6));
		assertTrue("equalsMyInteger",value.equalsMyInteger(5));
		assertFalse("equalsMyInteger",value.equalsMyInteger(77));
	}
	

}
