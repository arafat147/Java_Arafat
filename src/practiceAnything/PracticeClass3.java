package practiceAnything;

import java.util.Scanner;

public class PracticeClass3 {
	
	public static void checkAge() {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter your age");
		int studentAge = obj1.nextInt();
		if(studentAge >= 4 && studentAge <= 8) {
			System.out.println("you are eligible to get admission in first grade");
		}else {
			System.out.println("you are not eligible to get admission in first grade");
		}
		
	}

	
	public static void checkEligibility() {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int voterAge = obj.nextInt();
		
		if (voterAge >= 18 && voterAge <= 70) {
			System.out.println("you are eligible to vote");
		} else {
			System.out.println("you are not eligible to vote");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
			checkEligibility();
			checkAge();
		
	}

}
