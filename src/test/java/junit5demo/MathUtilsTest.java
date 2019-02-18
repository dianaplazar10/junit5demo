package junit5demo;
/*
 * Assertion convenience methods are as shown below and more... assertEqual......, 
 * usually with 2 parameters, an expected value and the actual,
 * 
 * However, we do have some assert method with 3rd "String " argument, which holds the description of a failure in assert... execution.
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils = new MathUtils();
	
	@Test
	void test() {		
		//System.out.println("This test ran"); The purpose is is avoid sysouts during builds or debugging
		
		int expected=2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected, actual);
		/*Other assert convenience methods are"
		assertArrayEquals(expected[], actual[]);// compares 2 arrays
		assertIterableEquals(Iterable<?> expected, actual); // compares 2 iterable objects
		
		assertFalse(1==1); // if false, success, else fails
		assertNotEquals(unexpected, actual);// fails if the 2 are equal
		
		fail("Not yet implemented");// throws fail for sure.
		*/
	}

	@Test
	void testCircleArea() {
		assertEquals(314.1592653589793, mathUtils.getCircleArea(10),"Should return Circle area");
	}

}
