package java_learniningautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser {

	
	public static String browserName = "edge";
	public static WebDriver driver;// class level variables
	
	public static void main(String[] args) {
		
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");// Cntrl + shift + F = formating
			driver.quit();
		} else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://flipkart.com");
			driver.quit();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://amazon.com");
			driver.quit();
		}else {
			System.out.println("nothing opened");
		}
	}
}
