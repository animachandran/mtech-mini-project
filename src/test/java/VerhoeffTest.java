package test.java;


import static org.junit.Assert.*;

import main.java.*;

import org.junit.Before;
import org.junit.Test;
public class VerhoeffTest {


	private String input;
	private String expectedOutput;
	private Verhoeff verhoeff;
	
//	public VerhoeffTest(String input, String expectedOutput) {
//		this.input = input;
//		this.expectedOutput = expectedOutput;
//	}	
	
	@Before
	public void before() {
		verhoeff = new Verhoeff();
	}
	/*Valid checksum*/
	@Test
	public void testValidAdhar() {
		assertEquals(true, 
				verhoeff.validateVerhoeff("499118665246"));
	}
	/*Invalid checksum*/
	@Test
	public void testInvalidAdhar() {
		assertEquals(false, 
				verhoeff.validateVerhoeff("499118665248"));
	}
	/*Missing Checksum*/
	@Test
	public void testNumberOfDigitsAdhar() {
		assertEquals(false, 
				verhoeff.validateVerhoeff("49911866524"));
	}
	/*Missing middle digit*/
	@Test
	public void testMissingDigitAdhar() {
		assertEquals(false, 
				verhoeff.validateVerhoeff("49911865246"));
	}
}