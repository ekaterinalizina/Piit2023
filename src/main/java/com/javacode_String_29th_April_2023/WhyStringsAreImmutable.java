package com.javacode_String_29th_April_2023;

public class WhyStringsAreImmutable {

			//Immutability concept is used for String Objects
			//String Objects are immutable
			//once String Object are created, its data or state cannot be changed
			
			//So basically what happens is - if we try to change the state of a String Object
			//Object, instead of changing it,
			//it will create another Object
	public static void main(String[] args) {
		String S = new String("Apple");
		S.concat("Macbook");//only trying to modify the obj
		System.out.println(S);//Apple answer would be Apple
		String S2= S.concat("Macbook");//It will create a new object, but it is not visible
		S= S.concat("Iphone");// here you are modifying the obj and it is changing the reference point to the new obj
		System.out.println(S);//AppleIphone 
		System.out.println(S2);//AppleMacbook
		

	}

}
