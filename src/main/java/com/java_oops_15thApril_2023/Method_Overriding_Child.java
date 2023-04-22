package com.java_oops_15thApril_2023;

public class Method_Overriding_Child extends Method_Overriding_Parent {

	
	public static void main(String [] args) {
		
		
		Method_Overriding_Child child = new Method_Overriding_Child();
		child.display();
		
		Method_Overriding_Parent parent = new Method_Overriding_Parent();
		parent.display();
	}
	
	//as we created method with the same name "display" the child method will be called first
	public static void display() {
		System.out.println("child's display");
	}
	
	public static void hello(int i) {
		System.out.println("this is child's int parameter method");
	}
}
