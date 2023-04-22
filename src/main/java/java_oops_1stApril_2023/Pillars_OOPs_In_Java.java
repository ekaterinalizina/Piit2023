package java_oops_1stApril_2023;

public class Pillars_OOPs_In_Java {

	public static void main(String[] args) {
		
		
		
		//Class is also a collection of objects
		//Bookish definition - class is a template that used to define methods.
		//Used to access members variables and methods
		
		//Class is a logical entity. It is not a physical entity
		//Class doesn't occupy memory space
		
		// OOPs - object oriented programming system 
		//6 pillars of OOPs in Java
		//1.Classes and Objects
		//2.Methods
		//3.Inheritance
		//4.Polymorphism
		//5.Abstraction
		//Encapsulation
		
		
		
		//Static is a property of a class
		//User defined Class can call user-defined methods directly only if static keyword
		//is associated with the method
		//What happens to the method which doesn't have static keyword associated with it?
		//Class makes an object and using the Object reference call that method which doesn't have static
		//keyword, associated with it.
		
		//There are 5 ways to create an object in Java
		//1. using "new" keyword
		//2.newInstance() method
		//3.clone() method
		//4. deserialization
		//5. factory methods
		
		
		//Objects are physical entities with properties.
		//Objects are instances (example) of a Class
		//Objecet occupies memory space
		//Obj is created using new keywords so the memory allocated in a Heap Area
		//Obj has certain properties:
		// 1. identification (name)
		// 2. State (Bree, color, age)
		// 3. Behavior (barking, sleeping, eating)
		
		//categorization of Object is simpler compared to Class
		//Object is collection of all non static entities of a Class

		
		//how to create an Object using the ClassName and "new" keyword
		
		new Pillars_OOPs_In_Java();// it is an object
		
		//we need to call non static method by calling the reference variable
		
		Pillars_OOPs_In_Java objRef = new Pillars_OOPs_In_Java();
		objRef.testSample();
		
		Pillars_OOPs_In_Java objRef1 = new Pillars_OOPs_In_Java();
		Pillars_OOPs_In_Java objRef2 = new Pillars_OOPs_In_Java();
		

		Pillars_OOPs_In_Java.sample();
		sample();
		
		
	}
	
	public static void sample() {
		System.out.println("This is sample method");
	}
	
	public void testSample() {
		System.out.println("this is testSample Method");
	}

}
