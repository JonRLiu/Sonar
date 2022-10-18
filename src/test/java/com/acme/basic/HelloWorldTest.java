package com.acme.basic;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.junit.Test;
import com.acme.basic.HelloWorld;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.testng.asserts.SoftAssert;

public class HelloWorldTest {
	public SoftAssert softAssertion = new SoftAssert();
	
	@Test
	public void sayHello() {
		
		//Arrange 
		HelloWorld sayHelloTest = new HelloWorld();
		String expected = "Hello World!";
		
		//Act
		String actual = sayHelloTest.sayHello();
		
		//Assert
		softAssertion.assertEquals(actual, expected);
		softAssertion.assertAll();
	}

	@Test
	public void notCovered() throws JsonParseException, JsonMappingException, IOException {
		InputStream getResultJsonFile = new FileInputStream("src/Homework_1_Result.json");
		HashMap<String, String> extectedList = new ObjectMapper().readValue(getResultJsonFile, HashMap.class);
		
		//Arrange 
		HelloWorld notCoveredTest = new HelloWorld();
		String expected = extectedList.get("expected");
		
		//Act
		String actual = notCoveredTest.notCovered();
		
		//Assert
		
		softAssertion.assertEquals(actual, expected);
		softAssertion.assertAll();
	}
}
