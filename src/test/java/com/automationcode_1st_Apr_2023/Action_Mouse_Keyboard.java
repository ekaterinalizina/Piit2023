package com.automationcode_1st_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Mouse_Keyboard {

	
		// TODO Auto-generated method stub
		
		// there are mouse actions and keyboard actions, which could be automated
		public WebDriver driver;
		
		@Test
		public void mouseActionsTest() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.get("https://jqueryui.com/draggable");
			driver.get("https://www.browserstack.com/");
			Actions action = new Actions(driver);
			WebElement getDemoButton = driver.findElement(By.xpath("//div[@ class = 'relative']/preceding::button[1]"));
			action.moveToElement(getDemoButton).perform();
			
			WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
//			action.moveToElement(getStartedFreeButton).click().perform();	
//			
//			driver.navigate().back();
			
//			Thread.sleep(3000);
			
			action.moveToElement(getStartedFreeButton).contextClick().perform();
		
		}
	

}
