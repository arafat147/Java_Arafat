package javaBasics;

public class Variables {
	
	
	
	//variable- variable is a container that contains a data value.
	//Variables are 2 types-//1.Global variables. 
						   //2.Local variables.
	
	
		//1. Global variables- are those which is inside of a class but outside of a method.
	String Name = "Alex";
	String Address = "Queens,NY";//these are variables with initailized value.
	int age;
	double salary;// these are globla variables with initialized value. meaning we can give any value later when calling it in a method
	
	
		//2. Local variables- inside a method
		// it must be inside of a method. 
	
	public static void main(String[] args) {
		
	    //local variable 
		String name = "Arafat";
		int age = 26;
		double height = 6.5;
		
	 System.out.println("name is  "+ name + "age is " + age + " height is " + height );
	 	
	 	int x = 10;
	    int y = 9;
	    System.out.println("boolean result is " + (x < y));//this is boolean operation. the result will only come as true or false.
	    int a = 10;
	    int b = 9;
	    System.out.println("boolean result is " + (a > b) );
		
		

	}

}
