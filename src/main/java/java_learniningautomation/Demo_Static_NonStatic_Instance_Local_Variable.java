package java_learniningautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Static_NonStatic_Instance_Local_Variable {

	public static WebDriver driver; // it is an instance variable declared under the Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
	}

}
