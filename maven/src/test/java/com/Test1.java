package com;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Test1 {

	private TestData test=null;
	
	@Before
	public void setUp(){
		test=new TestData();
	}
	
	@Test
	public void testData(){
		Assert.assertEquals("10","10");
	}
	
}
