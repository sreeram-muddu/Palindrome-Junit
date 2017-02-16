import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PalindromeTest {
	
	Palindrome p;
	boolean result;
	
	@Before
	public  void createObject(){
		p = new Palindrome();
	}

	@Test
	public void allValidTests() throws InvalidCharacterException {
		
		 result =p.isPalindrome("aba");
		assertTrue(result);
		result = p.isPalindrome("hey yeh");
		assertTrue(result);
		result = p.isPalindrome("abc@cba");
		assertTrue(result);
		result = p.isPalindrome("a");
		assertTrue(result);
		 result =p.isPalindrome("abba");
		assertTrue(result);
		 result =p.isPalindrome("1234321");
		assertTrue(result);
		result =p.isPalindrome("4");
		assertTrue(result);
	}
	
	@Test
	public void allInvalidTests() throws InvalidCharacterException
	{
		result =p.isPalindrome("abc");
		assertFalse(result);
		result =p.isPalindrome("abcd");
		assertFalse(result);
		result =p.isPalindrome("Abba");
		assertFalse(result);
		result =p.isPalindrome("123");
		assertFalse(result);
		
		
	}

	@Test(expected=NullPointerException.class)
	public void NullPointerTestMethod() throws InvalidCharacterException{
		p.isPalindrome("");
	}
	
	@Test(expected=InvalidCharacterException.class)
	public void InvalidCharacterException() throws InvalidCharacterException
	{
		p.isPalindrome("---aa---");
		
	}
	
	@After
	public void ClearObjects()
	{
		System.gc();
	}
	
}
