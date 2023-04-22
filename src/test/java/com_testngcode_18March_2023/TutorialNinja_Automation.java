package com_testngcode_18March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialNinja_Automation {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	@Test
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver (options);
		driver.get("http://www.tutorialsninja.com/demo/");
		}
	
	@Test(priority=1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	
		}
	@Test(priority=2)
	public void clickOnLogIn() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=2)
	public void clickOnRegister() {
		driver.findElement(By.linkText("My Account")).click();//?
		driver.findElement(By.xpath("//a[text() ='Register']")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Kate");
		driver.findElement(By.xpath("//input[@name = 'lastname' and @id='input-lastname']")).sendKeys("Li");
		driver.findElement(By.xpath("//input[@name = 'name=\"email' or@id='input-email']")).sendKeys("ekaterina.lizina87@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone' ]")).sendKeys("3477211353");
		driver.findElement(By.xpath("//input[@id='input-password' ]")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@id ='input-confirm']")).sendKeys("3477211353@");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@Test(priority = 2, dependsOnMethods = "clickOnRegister")
	public void loginUsingRegisteredDetails() {
		
	}
	
	@Test(priority=3)
	public void clickOnLoginPage() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@Test(priority=1)
	public void clickOnLogOut() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	@Test
	public void tearDown() {
		driver.quit();
	}
	
	
	}


