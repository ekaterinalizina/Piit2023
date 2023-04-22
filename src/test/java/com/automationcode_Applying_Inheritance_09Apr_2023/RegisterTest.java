package com.automationcode_Applying_Inheritance_09Apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		TestBase.openBrowserAndApplication();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority = 1)
	public void fillAllMandatoryFields() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Kate");
		driver.findElement(By.xpath("//input[@name = 'lastname' and @id='input-lastname']")).sendKeys("Li");
		driver.findElement(By.xpath("//input[@name = 'name=\"email' or@id='input-email']")).sendKeys("ekaterina.lizina87@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone' ]")).sendKeys("3477211353");
		driver.findElement(By.xpath("//input[@id='input-password' ]")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@id ='input-confirm']")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@Test (priority = 2)
	public void fillAllFields() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Kate");
		driver.findElement(By.xpath("//input[@name = 'lastname' and @id='input-lastname']")).sendKeys("Li");
		driver.findElement(By.xpath("//input[@name = 'name=\"email' or@id='input-email']")).sendKeys("ekaterina.lizina87@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone' ]")).sendKeys("3477211353");
		driver.findElement(By.xpath("//input[@id='input-password' ]")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@id ='input-confirm']")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	

}
