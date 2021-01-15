package javaBasics;

public class UseCasting {

	public static void main(String[] args) {
		
		//casting
		//Structure: it has to be these types only - int, double, byte, short,long.
		
		
		//explanation: here we hava an age variable integer type:
		//desired datatype + desired variable name =(datatype we want to convert into) + variable that we want to convert 
		int age = 26;
		//desired dataype we want to convert into is double + name of the variable which is newAge = (datatype we want the int change into) + int variable age.
		double newAge = (double) age;
		System.out.println("new age is " + newAge);
		
		//Practice 1:
		int number = 50;
		
		double salary = (double) number;
		System.out.println("new salary is " + salary);
		
		
		//Practice 2:
		double price = 550.99;
		
		int amount = (int) price;
		System.out.println("new amount is " + amount);
		
		//Practice 3:
		byte students = 55;
		int newStudents = (int) students;
		System.out.println("total newStudent number is " + newStudents);
		
		
		
		
	}

}
