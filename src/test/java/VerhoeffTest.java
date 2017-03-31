package test;


import static org.junit.Assert.*;

import main.Verhoeff;

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
	@Test
	public void testValidAdhar() {
		assertEquals(true, 
				verhoeff.validateVerhoeff("499118665246"));
	}
	@Test
	public void testInvalidAdhar() {
		assertEquals(false, 
				verhoeff.validateVerhoeff("499118665248"));
	}
}