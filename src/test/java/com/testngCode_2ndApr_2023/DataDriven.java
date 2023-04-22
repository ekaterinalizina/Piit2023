package com.testngCode_2ndApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Annotation is known as @DataProvider
	//1.returns a 2D Object array
	//2.pass all the elements of that 2D array [initialization process of Array] array[0][0] = "kp12"; and etc
	//3.you have to create the @Test and pass dataProvider
	//4.You have to pass the arguments in the Method under @Test == cols of the 2D array
	
public class DataDriven {
	
	public WebDriver driver;

	@Test(priority = 1, dataProvider = "dataForTNLogin")
	public void loginNinjaTest(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(priority = 2, dataProvider = "dataForRediffLogin")
	public void loginRediff(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.cssSelector("input#login1")).sendKeys(username);
	driver.findElement(By.cssSelector("input#password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	}

	@DataProvider(name = "dataForTNLogin")

	public Object[][] getNinjaData(){

	Object[][] ninjaData = {{"seleniumpanda@gmail.com", "Selenium@123"},
	{ "seleniumpanda1@gmail.com", "Selenium@123"},
	{ "seleniumpanda2@gmail.com", "Selenium@123"},
	{ "seleniumpanda845@gmail.com", "Selenium@123" }};

	return ninjaData;
	}

	@DataProvider(name = "dataForRediffLogin")

	public Object[][] getData(){

	Object[][] rediffData = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda1@gmail.com", "Selenium@123"},
	{ "seleniumpanda2@gmail.com", "Selenium@123"},
	{ "seleniumpanda845@gmail.com", "Selenium@123" }};

	return rediffData;
	}
	

}
