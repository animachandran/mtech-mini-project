package test.java;


import static org.junit.Assert.*;

import main.java.*;

import org.junit.Before;
import org.junit.Test;
public class VerhoeffTest {


	private String input;
	private String expectedOutput;
	private Verhoeff verhoeff;
	

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
	/*Adhar number with more than 12 digits*/
	@Test
	public void testAdharLenGreaterThan12() {
		assertEquals(false, 
				verhoeff.validateVerhoeff("4991186652466"));
	}
	
}
