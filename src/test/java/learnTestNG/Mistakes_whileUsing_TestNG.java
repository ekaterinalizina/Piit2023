package learnTestNG;

import org.testng.annotations.*;

public class Mistakes_whileUsing_TestNG {

	//no main method in TestNG
	//line 56-60 in pom should be 7.7.1
	//make sure we us import.testng not jUnit
	//we create Class in src/test
	
	
	@Test
	public void testcase1() {
		System.out.println("this is an exec. engine");
	}
	
	
	
	
	
	
	
	
}
