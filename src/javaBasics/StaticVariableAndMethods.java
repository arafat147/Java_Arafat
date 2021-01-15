package javaBasics;

public class StaticVariableAndMethods {

	static String name;//this is static global variable
	static int age;//this is static global variable
	String location;
	
	public static void address() {
	String	location = "astoria, NY ";
	StaticVariableAndMethods.age = 25;
	StaticVariableAndMethods.name = "Alex";
	System.out.println("name is " + StaticVariableAndMethods.name + " age is " + StaticVariableAndMethods.age + " and location is "+ location);
	}
	
	
	
	public static void main(String[] args) {
		// static variable and name can be called by their class name.
		int newAge = StaticVariableAndMethods.age = 50;
		String newName = StaticVariableAndMethods.name = "Alex";
		System.out.println(" age is "+ StaticVariableAndMethods.age + " and name is " + StaticVariableAndMethods.name);
		System.out.println("age is " + newAge + " and name is " + newName);
		StaticVariableAndMethods.address();
	}

}
