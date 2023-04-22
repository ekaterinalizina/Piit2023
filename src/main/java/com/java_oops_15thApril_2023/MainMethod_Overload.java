package com.java_oops_15thApril_2023;

public class MainMethod_Overload {

	public static void main(String[] args) {
		System.out.println("Original Main method without parameters");
		main();
		main(10);
		main(args = new String[4], args = new String[5]);//we create connection with Main method, not the main with 2 Strings []
//args1 and args2	}
	}
	public static void main() {
		System.out.println("main method without parameters");	

	}
	
	public static void main(int i) {
		System.out.println("main method with int parameter");		

	}
	
	public static void main(String[] args1, String[] args2 ) {
		System.out.println("Main method with 2 string arrays parameters");

	}

}
