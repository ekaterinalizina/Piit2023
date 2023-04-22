package com.automationcode_Applying_Inheritance_09Apr_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {//this will act as a Parent Class for all others Test Classes
	
	public static WebDriver driver;
	public static void openBrowserAndApplication() {//constructor of Parent class
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("http://www.tutorialsninja.com/demo/");
	}
	

}
