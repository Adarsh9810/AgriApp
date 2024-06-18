package com.test01;

import org.testng.Assert;
import org.testng.annotations.Test;


public class B2cAppTest {

	@Test
	public void testlogin1()
	{
		b2cApp myapp=new b2cApp();
		Assert.assertEquals(0,myapp.userLogin("abc","abc1234"));
		
	}
	
	@Test
	public void testlogin2()
	{
		b2cApp myapp=new b2cApp();
		Assert.assertEquals(1,myapp.userLogin("abc","abc@1234"));
		System.out.println("testing");
	}
}
