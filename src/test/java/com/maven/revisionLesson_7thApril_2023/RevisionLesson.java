package com.maven.revisionLesson_7thApril_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RevisionLesson {
 
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("this is Before Suite which shall execute first");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("this is Before test which shall execute after @BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("this is Before class which shall execute after @BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("this is Before method which shall execute after @Beforeclass");
	}
	
	@Test
	public void testCase1() {
		System.out.println("this is test case 1");
	}
	
	@AfterMethod
	public void afterClassAnnotation() {
		System.out.println("this is after class  which shall execute after test method");
	}
	
	@AfterClass
	public void afterMethodAnnotation() {
		System.out.println("this is after method  which shall execute after testCase");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("this is after test which shall execute after afterClass");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("this is after suite which shall execute after afterTest");
	}
	
}
