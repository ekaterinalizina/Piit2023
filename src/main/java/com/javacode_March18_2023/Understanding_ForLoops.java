package com.javacode_March18_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for(initialize ; condition; inc/dec){    - all 3 conditions are not dependent on each other

//	}

		for(int i=1; i <= 5; i++) {
			System.out.println("the value is: " + i);
		}
	

	// Step1: initialized value is taken into consideration
	// Step2: check for the condition
	// Step3: if the condition is true, the control flow will go inside the body of
	// the for loop
	// Step4: if the condition is false, then it will exit
	// Step5: then control goes to iteration and it is compared with the condition
	// Step5: then the logic again goes back in the same flow till the condition is
	// false

	// print 1 to 20 using for loop
	for(

	int i = 1;i <= 20; i++)
	{
		System.out.print(i + ",");
	}
	System.out.println(" ");
	
	// print first 10 multiplies of 5 using for loop
	for(int b = 5; b >= 20; b*=5)
	{
		System.out.print(b + ",");
	}
	System.out.println(" ");
	
	// print starting from 100 and decreasing 10 till 0 (100, 90, 80...0)
	for(
	int c = 100; c >= 0 ; c-= 10)
	{
		System.out.print(c + ",");
	}
	System.out.println(" ");
	
	// print first 20 multiples of 2 and add all the values and give the sum (2,4,
	// 6, ...50)
	for(
	int d = 2 ; d>=2*20; d=d+d*2)
	{
		System.out.print(d + ",");
	}
	// sum = 2+4+8 ...+40 =?
	System.out.println(" ");
	}

}