package com.javacode_19thMarch_2023;

public class MoreOnForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested for loop
		// for loop inside for loop
		
		for(int i=1; i<=2; i++) { //outer for loop represent Rows
			
			for(int j=1; j<=i; j++) {//inner for loop represents Cols
				//body of the inner for loop
				//for any execution of outer for loop inner for loop represents completely
				System.out.print("Hello");
			}
			System.out.println("Row");
			// this is the body of outer for loop
		}
		
		
		
	}

}
