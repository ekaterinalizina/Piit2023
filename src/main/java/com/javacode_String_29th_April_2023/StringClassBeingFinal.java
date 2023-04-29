package com.javacode_String_29th_April_2023;

public class StringClassBeingFinal {

	//final is a keyword in Java which is used with Classes, Methods and variables
	//anything which is termed final cannot be changed
//	public static void main(String[] args) {
//		
//		int i = 10;
//		i= i+2;
//		System.out.println(i);//i became 12
//		
//		final int j = 5;
//		//j = 3; //it is not allowed, it is final variable
//		
//		
//	}
	
	 void show() {// if we do it final then you can't override in child class, it can't be changed. Then we are loosing 
		//the purpose of overriding
		
	}

} class Test extends StringClassBeingFinal{// if we make StringClassBeingFinal final, then we can't extend it.
	
	void show() {
		
	}
}
