package com.testng_15thApril_2023;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(MyListener.class)
public class RediffListenerLoginTest {

	public WebDriver driver;
	
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com");
		
	}
	@Test (priority = 1)
	public void clickOnSignIn() {
		
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	}
	
	@Test (priority = 2)
	public void clickOnSignLink() {
		
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();
		
		
	}
	
	@Test (priority = 2)
	public void clickOnSignInButton() {
		
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();
		
		
	}
	
	@Test (priority = 3)
	public void clickLogout() {
		
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();
		driver.findElement(By.className("rd_logout")).click();
//		WebElement rediffHomelink = driver.findElement(By.xpath(""))
//		
//		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10)));
	}
}
