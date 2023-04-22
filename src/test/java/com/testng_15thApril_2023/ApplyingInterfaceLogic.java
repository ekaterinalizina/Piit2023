package com.testng_15thApril_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplyingInterfaceLogic {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver() ;
		
	//WebDriver has lot of abstract methods
		//ChromeDriver is an implementing class
	//an Interface can refer to the object of a Class
	//	it is a responsibility of CromeDriver to implement unimplemented method
		driver.manage().window().maximize();// manage() is an unimplemented method & window() & mazimize()
		
		driver.get("https://rediff.com");// unimplemented method with parameters
		
	}
}
