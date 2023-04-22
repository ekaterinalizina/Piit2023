package learnTestNG;

import org.testng.annotations.*;

public class ImportanceOfBM_Test_AM {
	
	//tri-combo bm> test1> am   bm> test2> 
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("this is bm");
	}
	
	@Test
	public void testCase1() {
		System.out.println("this is test case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("this is test case2");
	}
	@Test
	public void testCase3() {
		System.out.println("this is test case3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is am");
	}

}
