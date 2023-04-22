package java_oops_1stApril_2023;

			//1.Instance Variables
			//2.Static v.
			//3. Local v.
			
			//Class variable - u can use for Java
			//any variable defined under the Class bun ton in any method	

public class Variables_In_Java {
		String name; //instance v.
		int age; //instance v.
		double balance; //Class variable without static word calls - Instance v.
		static int wheels = 4;// class veriable which is static calls - Static variable
	
	// we can define variable here or we can define it later
	public static void main(String[] args) {
		
		
	}
	
	public static void sample() {
		int age = 10; // local variables - they do not have static or non-static definition.
	}
	//Even the method is static, local variables are just local variables, and static or nonstatic are not associated with local variables.
	//Only Class variables can be static or non-static.
	
	


}
