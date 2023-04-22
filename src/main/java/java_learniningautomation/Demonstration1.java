package java_learniningautomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demonstration1 {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-mazimized");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origings = *");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
	}

}
