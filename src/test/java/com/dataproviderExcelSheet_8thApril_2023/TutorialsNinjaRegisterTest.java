package com.dataproviderExcelSheet_8thApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TutorialsNinjaRegisterTest {
	public WebDriver driver;
	
	@Test
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
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
}

