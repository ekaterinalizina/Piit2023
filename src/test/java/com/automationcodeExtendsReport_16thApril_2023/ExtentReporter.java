package com.automationcodeExtendsReport_16thApril_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() throws IOException {
	//Step1: make sure the dependecy of extentreports is inside pom.xml file
	//Step2: Create the object of ExtentReports Class
	ExtentReports extentReport = new ExtentReports();
	
	//Step3: Create the object of File Class and pass the path of the .html file in the 
	File extentReportFile = new File(System.getProperty("user.dir")+ "//test-output//ExtentReports//extentreport.html");

	//Step4: Create the obj of ExtenSparkReport Class and pass the File reference in the constructor
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);

	//Step5: using the  sparkReporter, we can configure a lot of things
	
	sparkReporter.config().setTheme(Theme.DARK);
	sparkReporter.config().setReportName("TN Automation Results");
	sparkReporter.config().setDocumentTitle("TNReportTitle|Automation|Results");
	sparkReporter.config().setTimeStampFormat("mm/dd/yyyy hh:mm:ss");
	
	//Step6: We need to attach the ExtentReport with teh SparkRporter
	extentReport.attachReporter(sparkReporter);
	
	//Step7: Additional information
	//Step7.1: Create a Properties file and add necessary details in the Properties file
	//Step7.2: you have to write the code of how to read data from the Properties file here
	
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\automationcodeExtendsReport_16thApril_2023\\configProperties\\");
	
	prop.load(ip);
	
	//Aplication url, browserName, username, password, Operation System, Java Verstion, name of the SDET
	
	extentReport.setSystemInfo("application url", prop.getProperty("url"));
	extentReport.setSystemInfo("browser name", prop.getProperty("browser"));
	extentReport.setSystemInfo("username", prop.getProperty("validUsername"));
	extentReport.setSystemInfo("password", prop.getProperty("validPassword"));
	extentReport.setSystemInfo("operation system", System.getProperty("os.name"));
	extentReport.setSystemInfo("operation system version", System.getProperty("os.version"));
	extentReport.setSystemInfo("SDET name", System.getProperty("user.name"));
	extentReport.setSystemInfo("java verstion", System.getProperty("java.version"));
	extentReport.setSystemInfo("java vendor", System.getProperty("java.vendor"));
	
	//Step8: Return the ExtenReport
	
	return extentReport;
	
	
	}
	
}