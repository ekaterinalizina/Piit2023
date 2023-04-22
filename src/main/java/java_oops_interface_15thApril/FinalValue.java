package java_oops_interface_15thApril;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalValue extends Demo implements Execute, ExecuteNew {

	//Class can extend other class, class can implement an Interface, class can implement multiple Interfaces
	//class can same time extend other class and implements multiple Interfaces
	public static void main(String[] args) {
		//here FinalValue is know as the implementing class
		//it is the responsibility of the implementing class to invoke the unimplemented methods
		//of the abstract class it extends and interfaces it implements
		
		//Can I create the object of an interface? - NO!!!
		
		WebDriver driver = new ChromeDriver();
		//WebDriver is interface, ChromeDriver is a class (it is not an abstr class)
		//Can an abstr class implements an interface? - Yes!

	}

	@Override
	public void chase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void world() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sky() {
		// TODO Auto-generated method stub
		
	}

}
