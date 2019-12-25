import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		
		this.input = input;
		this.expectedOutput = expectedOutput;
		
	}



	@Parameters
	public static Collection<String[]> testConditions() {
		
	String[][] expectedOutputs = {
			{"AACD","CD"},
		    {"ACD","CD"}
	};
		
		return Arrays.asList(expectedOutputs);
	}
	


	@Test
	public void testTruncateAInFirst2Positions() {
		//AACD =>  CD  ACD => CD CDEF => CDEF CDAA=> CDAA
		/*
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		
		assertEquals(expected,actual);
		*/
		
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
		
	}
	
	/*
	 * We dont need to use this methos 
	@Test
	public void testTruncateAInFirstPositions() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		 
	}
	*/
	
	
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
