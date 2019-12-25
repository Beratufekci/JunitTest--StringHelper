import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void setup() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		//AACD =>  CD  ACD => CD CDEF => CDEF CDAA=> CDAA
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		
		assertEquals(expected,actual);
		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		
	}
	
	
	@Test
	public void testTruncateAInFirstPositions() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		 
	}
	
	
	//ABCD => FALSE  ABAB => TRUE AB => TRUE A => FALSE
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
		boolean expectedValue = true;
		
		assertEquals(expectedValue,actual);
		
		//assertFalse(actual);
		//assertFalse("The condition failed" , true);//expected = false actual = true so it it gives an error
		//assertTrue(actual); this method expect true but return value is false that's why it gives an error.
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
