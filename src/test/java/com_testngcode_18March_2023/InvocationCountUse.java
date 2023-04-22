package com_testngcode_18March_2023;

import org.testng.annotations.Test;

public class InvocationCountUse {

	@Test(priority=1)
	public void sample1() {
		System.out.println("This is Test1");
	}
	
	@Test(priority=2)
	public void sample2() {
		System.out.println("This is Test2");
	}
	
	@Test(priority=3, invocationCount=5)//you specify how many times you want 
	//exactly this TestCase executed
	public void sample3() {
		System.out.println("This is Test");
	}
	
}
