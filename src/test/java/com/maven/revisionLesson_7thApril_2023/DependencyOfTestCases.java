package com.maven.revisionLesson_7thApril_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyOfTestCases {
	
	@BeforeMethod
	public void bm() {
		System.out.println("this is bm");
	}
	
	@Test
	public void tc1() {
		System.out.println("this is test case1");
	}
 
	@Test(dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("this is test case2");
	}
	
	@Test (dependsOnMethods = {"tc1", "tc2"})
	public void tc3() {
		System.out.println("this is test case3");
	}
	
	@Test
	public void tc4() {
		System.out.println("this is test case4");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("this is after method");
	}
	
}

