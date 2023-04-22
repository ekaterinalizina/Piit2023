package com.java_oops_15thApril_2023;

public class Method_Overloading {

	public static void main(String[] args) {
		sampleData();
		sampleData(1);
		sampleData(1, 2);
		sampleData ("String_method");
		sampleData(new StringBuffer("Daily"));
		sampleData(new StringBuilder("Home"));
		Method_Overloading obj = new Method_Overloading(); // to call non-static method
		obj.sampleData(2, 3, 5);
		
	}
	
	public static void sampleData() {
	System.out.println("this is a no parameter method");	
	}
	
	public static void sampleData(int i) {
		System.out.println("this is a single int parameter method");		
	}

	public static void sampleData(int i, int j) {
		System.out.println("this is two int parameter method");	
}	
	public static void sampleData(String s1) {
		System.out.println("this is single string parameter method");	
}	
	
	public static void sampleData(StringBuffer s1) {
		System.out.println("this is single stringBuffer parameter method");	
}	
	//for stringBuilder we need to pass an object
	public static void sampleData(StringBuilder s1) {
		System.out.println("this is single stringBuilder parameter method");	
}	
	
	public void sampleData(int i, int j, int k) {
		
		System.out.println("this is three parameter method");	
		}
}
