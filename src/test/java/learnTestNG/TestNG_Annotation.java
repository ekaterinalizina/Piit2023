package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {
	
	//@AnnotationName
	//below the annotation you have to create a method, most of the time we don't use static
	//Cntr +shift + O  then we will see import org.testng.annotations.BeforeSuite;
	//this shouldn't be jUnit import!!!
	
	//@BeforeTest after we correct the import and add star import org.testng.annotations.*;
	//ctrl + s
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is Before Method");
	}
	
	//the most important - it is representation of test case
	
	@Test
	public void testCaseAnnotation1() {
		System.out.println("This is TestCase1");
	}

	@Test
	public void testCaseAnnotation2() {
		System.out.println("This is TestCase2");
	}
	
	@Test
	public void testCaseAnnotation3() {
		System.out.println("This is TestCase3");
		Assert.fail("Deliberately failing this test case");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is After Class");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is Before Method");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is After Suite");
	}
	
	
}
