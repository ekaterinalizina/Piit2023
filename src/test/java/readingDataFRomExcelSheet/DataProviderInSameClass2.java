package readingDataFRomExcelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass2 {
	//DataProvider annotation returns a 2D object array
	//you have to pass the dataProvider = name of the metheod inside the @DataProvider
	//You have to overload the method under the @Test with the parameters
	
	public WebDriver driver;
	
	

		@Test (dataProvider = "getData")
		public void enterLoginCredentials( String userName, String password) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("htpps://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//a[@class='signin']")).click();
			driver.findElement(By.xpath("//input[@id ='login1' and @name = 'login']"))
			.sendKeys(userName);
			driver.findElement(By.xpath("//input[@id ='password' or @name = 'passwd']"))
			.sendKeys(password);
			driver.findElement(By.xpath("//input[@name ='proceed' or @class= 'signinbtn']")).click();
		}
		
		@DataProvider
		public static Object[][] getData() {
			Object [][] data = {{"seleniupanda@rediffmail.com", "Selenium@123"},
								{"seleniupanda1@rediffmail.com", "Selenium1@123"},
								{"seleniupanda4@rediffmail.com", "Selenium4@123"},
								{"seleniupanda2@rediffmail.com", "Selenium2@123"}};
			return data;
		}
		
	}


