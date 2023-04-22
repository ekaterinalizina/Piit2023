package com.automationcode_5thMarch_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MoreComands {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();//ChromeOptions is a class predefined in selenium 
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//creating object options. NONE, NORMAL, EAGER
		options.addArguments("--incognito");
		//manually to open incognito mode in a browser  cntl + shift + N
		// NONE - slow, NORMAL - faster, EAGER - fast, control speed of excecution
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicitWait - smart way, if 01 sec everything done, the system won't wait the rest 09 seconds
		//explicitWait - system will wait 10 seconds in any way
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

}
