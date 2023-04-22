package com.revision.Arpil7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeterizationCode {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void paraRediffTest(String Browser, String url, String username, String password) {
		
		if(Browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		
		
	}

}
