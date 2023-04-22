package com.java_oops_15thApril_2023;


// 100% abstr
//all the variables inside the interface are public, static, final in nature

//what is an interface

// interface - is a blueprint of the class, it specifies the methods that a class should implement
//but it does not provide any implementation details of those methods
//interfae tells a class what to do but not How to do

//the implementation details of the methods are left to the implementation class
// all the method in interface are abstract by the nature
//default keyword could be used only in interfaces and it allows them to have the body 
//and only to them allows to have body

public interface Execute {
	int i = 10; // same as public static final int i = 10;
	
	public static final int k = 10;
	
	public void secret();
	
	default void world() { // has body, because has default keyword
		
	}
	
	public void green();
}
