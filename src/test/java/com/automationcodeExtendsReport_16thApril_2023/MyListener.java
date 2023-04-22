package com.automationcodeExtendsReport_16thApril_2023;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//source -> implement-> implement all unimplemented methods
//ITestResult is an interface, acting as input parameter of "result" variable

public class MyListener implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("operation started");
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
		System.out.println(testName + "starting test");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "past test");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "skipped");
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
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
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
