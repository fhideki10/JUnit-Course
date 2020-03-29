package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedBooleanTest {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedResult;
	
	public StringHelperParameterizedBooleanTest(String input, String expectedResult) {
		super();
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		//ABCD => false || ABAB => true || AB => true || A => false
		String expectedResults[][] = {{"ABCD", "false"}, {"ABAB", "true"}, {"AB", "true"}, {"A", "false"}};
		return Arrays.asList(expectedResults);
	}		
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		if(Boolean.parseBoolean(expectedResult) == true) {
			assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input)); 
		}else {
			assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input)); 
		}		
	}

}
