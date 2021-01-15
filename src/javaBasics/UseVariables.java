package javaBasics;

public class UseVariables {

	
	//global variables
	String name;//not initialized
	int age = 50;// initialized
	
	
	//local variables
	public void variable() {
		name = "alex";//here we used global variable by calling its variable name only
		age = 26;
		int roll = 10;
		double marks = 85.50;
		System.out.println("Student name is " + name + " , age is " + age + " roll number is " + roll +" " + "and marks is " + marks);
	}
	
	
	
	public static void main(String[] args) {
		//to call any method we need to create an object of that class
		//syntax is : class name + object name = new(keyword) + Constractor(which is the name of the class)+ ();
		UseVariables obj = new UseVariables();
		obj.variable();
		
	}

}
