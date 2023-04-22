package java_oops_2ndApr_2023;

public class Student {
	
	String name;//default value if not specified is null | instant variables
	int student_id;//default value is 0
	int age;
	int hight_instVar;
	
	//constructors
	//is a block which looks like a method but it has the name of the Class
	//Constructor does not have a return type
	//public, private, protected, default - all this access modifiers are applicable for constructors
	//constructors are invoked the moment object is created
	
	//Use of constructors:
	//1.Initialize an object
	//2. It is used to optimize an the code
	
	//Misconception and people confuse you in interview
	//Constructors are use to create an Obj [not true at all]
	
	//Types of Constructor
	//1. Default constructor [compiler auto generates this when an Object is created]
	//2.No Argument\paramerers Constructor [user-defined]
	//Parameterized constructor [user-defined]
	

	public static void main(String[] args) {
		Student st1 = new Student("Tom", 101, 25, 104);
		
		System.out.println(st1.name + ""+ st1.student_id + ""+ st1.age);
		
		Student st2 = new Student("Nik", 102, 26, 115);
		System.out.println(st2.name + ""+ st2.student_id + ""+ st2.age);
		
//		Student st1 = new Student();
//		st1.name = "Tom";
//		st1.student_id = 101;
//		st1.age = 25;
//		
//		Student st2 = new Student();
//		st2.name = "Nik";
//		st2.student_id = 102;
//		st2.age = 26;
		// it is not a good aproach occupies too much space
		
		
		
		

	}
	//this is a constractor
	public Student(String name, int student_id, int age, int hight) {//local variables
		this.name = name; // this.name is instanse variables, this key word is used 
		//to instantiate the instanse v. with local v.
		this.student_id = student_id;
		this.age = age;
		hight_instVar = hight;// if the names of instant var is differe from local var,
		//we don't need to use key word this
	}

}
