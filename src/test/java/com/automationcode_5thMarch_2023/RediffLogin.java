package com.automationcode_5thMarch_2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RediffLogin {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
	}

}
