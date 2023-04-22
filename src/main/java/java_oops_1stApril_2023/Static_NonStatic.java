package java_oops_1stApril_2023;

public class Static_NonStatic {
	
	// Class - static is just a definitive thing that allow you to interact in a class level.
	//NonStatic - is not a keyword. By default it is nonstatic. It means Object level interaction.
	//Static will only call static entities
	//Static will call  non-static entities
	
	//nonstatic can intereact with static  [but with a warning]

	public static void main(String[] args) {
		Static_NonStatic.sample();//tatic is just a definitive thing that allow you to interact in a class level.
		
		sample();//tatic will only call static entities. Both methods are static
		
		Static_NonStatic obj = new Static_NonStatic();
		obj.test();
		
		obj.sample();//nonstatic can intereact with static  [but with a warning]. //
		//there is now sense to use nonstatic intity for static intity.
		
		//sample method can't call test method (static can't call nonstatic method)
		//test method can call sample method (non static can call static)
	}
	
	public static void sample() {
		int i = 1;
		int j = 4;
		int sum = i + j;
		System.out.println(sum);
	}
	
	public void test() {
		String S1 = "Hello";
		System.out.println(S1);
	}

}
