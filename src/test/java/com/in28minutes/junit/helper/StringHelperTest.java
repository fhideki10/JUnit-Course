package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	//AACD => CD || ACD => CD || CDEF => CDEF || CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {	
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));	
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));	
	}
	
	//ABCD => false || ABAB => true || AB => true || A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_2CharactersPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_1CharactereNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A")); 
	}

}
