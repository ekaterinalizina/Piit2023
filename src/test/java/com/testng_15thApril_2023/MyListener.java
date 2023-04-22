package com.testng_15thApril_2023;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automationcodeExtendsReport_16thApril_2023.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//source -> implement-> implement all unimplemented methods
//ITestResult is an interface, acting as input parameter of "result" variable

public class MyListener implements ITestListener{
	public ExtentReports extentReport;
	public ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
		try {
			extentReport = ExtentReporter.generateExtentReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.INFO, testName + "-> started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.PASS, testName + "-> passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		String testName = result.getName();
//		WebDriver driver = null;
//		
//		try {
//			 driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//	
//			e.printStackTrace();
//		}
//		
//		File source = ((TakesScreenshot).driver).getScreensShotAs(OutputType.FILE);
//		String destinationFile = System.getProperty("user.dir")+ "\\test-output\\screenshot\\" + testName + ".png";
//		
//		//I want to attach the screenshot
//		extentTest.addScreenCaptureFromPath(destinationFile);
//		extentTest.log(Status.INFO, result.getThrowable());
//		extentTest.log(Status.FAIL, testName + "-> failed");
	}
	
	

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.SKIP, testName + "-> skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	

	
	
	
	
	

	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Operation Finished");
		extentReport.flush();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	//this class will implement ITestListener
}
