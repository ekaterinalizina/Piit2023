package com.dataproviderExcelSheet_8thApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffCreateAccountTest {
	
	public WebDriver driver;
	
	@Test
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text() = 'Create Account']")).click();//?
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Kate");
		driver.findElement(By.xpath("//input[starts-with(@name, 'login')]")).sendKeys("selenium545Kate");
		driver.findElement(By.className("//input[@class = 'btn_checkavail']")).click();
		
		
		driver.findElement(By.xpath("//input[@id = 'Register']")).click();
		String actualUnregisteredWarningMessage = driver.findElement(By.xpath("//input[@id = 'Register']")).getText();
	}
	}


