package java_oops_9April_2023;

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.bankBalance();
		child.apartment();
		child.bike();
		child.sportsCar();
		
		Parent parent = new Parent();
		parent.apartment();
		parent.bankBalance();
	}
	
	public void sportsCar() {
		System.out.println("Child's sport car");
	}
	
	public void bike() {
		System.out.println("Child's bike");
	}
	
}
