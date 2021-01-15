package javaBasics;

public class UseIfElseIf {

	public static void main(String[] args) {
		
		int marks = 60;
		String grade;
		
		if (marks > 90) {
			grade = "A";
		}else if (marks > 80) {
			grade = "B";
		}else if (marks >70) {
			grade = "C";
		}else if (marks >50) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("your grade is " + grade);
		
		//here we have to memorize that print line will come where the condition is true. cz it goes on each condition and when the condition fulfills
		//then the print line will execute with that grade.
		
		//practice 2.
		int marks2 = 50;
		if (marks2 > 90 ) {
			System.out.println("Your grade is A");
		}else if (marks2 > 80) {
			System.out.println("Your grade is B");
		}else if (marks2>70) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");
		}
		//this is another approach
		
	}
	
	
}
