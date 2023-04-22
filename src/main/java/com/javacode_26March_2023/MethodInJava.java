package com.javacode_26March_2023;

//Methods are also known as functions
//Methods are known as independent units of execution
//Syntax: AccesModifiers static/non-static returnType nameOfTheMethod(parametres){body}
public class MethodInJava {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		hello();
		int sumAgain = sample (10, 20, 30);// to call the method with parameters we need to define parameters
		
	}
	
	public static int sample(int i, int j, int k) {
		i= 10;
		j = 20;
		k = 30;
		
		int sum = i + j + k;
		return sum;// what are we are trying to return? the method should be same type, what we returning
	}
	
	public static String test(String S1, String S2) {
		String  S3 = S1 + S2;
		return S3;
		
	}
	public static void hello(){
		System.out.println("This is helo method");
	}
	
	
	
	
}
