package com.javacode_March18_2023;

public class Loops_While {

	
	//While Loop Syntax

	//Step1: You have to initialize a value of a variable
	//Step2: You have to pass the condition in the while
	//Step3: If your condition is true, the control will go inside the body of the while loop
	//Step4: If your condition is false, the control will go inside the body of the while loop
	//Step5: To control your logic you may choose to increment or decrement a certain value

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1 = true;
		
		while(b1 != false) {
			System.out.println("The grass is green");
			break;//to stop it at one point
		}
		
		int a = 1;
		
		while(a <= 10) {
			
			System.out.print(a);
			a++;
			continue;
		}
		
		//print numbers backward from 20 to 1 using while loop
		System.out.println(" ");
		int i = 20;
		while (i >= 1) {
			System.out.print(i + ";");
			i--;
		}
		
		System.out.println("");
		int b = 2;
		while(b <= 40) {
			System.out.print(b + ";");
			b+=2;
			
		}
		
		//print from 100, 95, 90, ...5
		
		System.out.println("");
		int k = 100;
		while(k >= 5) {
			System.out.print(k + ";");
			k-=5;
			
		}
		
	}

}
