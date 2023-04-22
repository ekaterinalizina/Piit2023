package java_oops_Constructors_concept_15thApr;

public class Student_Constructors_Practice {

	String name;
	int studentId;
	int yearOfgraduation;
	String major;
	String commuter;
	String internship;
	
	public static void main(String[] args) {
		
		Student_Constructors_Practice s1 = new Student_Constructors_Practice ("Anna", 1, 2024, "Art", "yes", "yes");
		System.out.println(s1.name + " " + s1.studentId + " " + s1.yearOfgraduation + " " + s1.major + " " + s1.commuter  + " " + s1.internship);
		Student_Constructors_Practice s2 = new Student_Constructors_Practice ("Ben", 2, 2024, "Math", "yes", "yes");
		Student_Constructors_Practice s3 = new Student_Constructors_Practice ("Cate", 3, 2024, "IT", "yes", "yes");
		Student_Constructors_Practice s4 = new Student_Constructors_Practice ("Dan", 4, 2024, "Security", "yes", "yes");
		Student_Constructors_Practice s5 = new Student_Constructors_Practice ("Fuentes", 5, 2024, "Art", "yes", "yes");
		Student_Constructors_Practice s6 = new Student_Constructors_Practice ("Garsia", 6, 2024, "Social science", "yes", "yes");
		Student_Constructors_Practice s7 = new Student_Constructors_Practice ("Henry", 7, 2024, "Art", "yes", "yes");
		Student_Constructors_Practice s8 = new Student_Constructors_Practice ("Inga", 8, 2024, "Business Administration", "yes", "yes");
	}
	
	public Student_Constructors_Practice (String name, int studentId, int yearOfgraduation, String major, String commuter, String internship) {
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		this.commuter = commuter;
		this.internship = internship;
	}

}
