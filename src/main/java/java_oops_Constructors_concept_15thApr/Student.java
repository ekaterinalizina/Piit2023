package java_oops_Constructors_concept_15thApr;

public class Student {

	
	String name;//default value is null
	int age;//default value is "0"
	String subject;
	public static void main(String[] args) {
		
//		Student s1 = new Student();// object is a collection non-static entities of the class. 
//		// S1 is a collection of name, age, subject.
//		
//		s1.name = "Tom";
//		s1.age = 10;
//		s1.subject = "Science";
//		
//		Student s2 = new Student();// s2 will have the same entities as s1.
//		s2.name = "Henry";
//		s2.age = 11;
//		s2.subject = "Math";
		
		Student s1 = new Student("Tom", 10, "Science");
		System.out.println(s1.name + " " + s1.age  + " " + s1.subject);
		Student s2 = new Student("Harry", 12, "Math");
		
		System.out.println(s2.name + " " + s2.age  + " " + s2.subject);
	}
	
	//instance variable are blue in color, local variable is brown in color. If they have same names, 
	//than we need to use this keyword. If they have different names, we don't need to use "this" key word.
	//the purpose of this keyword = instantiates variables of the current class
	
	
	//user defined constructor
	public  Student(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

}
