package practiceAnything;

import java.util.Scanner;

public class PracticeCLass2 {

	public static void main(String[] args) {
		
		//Scanner-1
		/*Scanner input = new Scanner(System.in);
		System.out.println("enter your user name ");
		String name = input.nextLine();
		System.out.println("your user name is " + name);*/
		
		//Scanner-2
		/*Scanner input2 = new Scanner(System.in);
		System.out.println("enter your id number");
		int id = input2.nextInt();
		System.out.println("your id number is " + id);*/
		
		//Arithmatic operator
		
		/*int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
		
		//Unary operator
		
		/*
		 int a = 10;
		
		System.out.println(a);
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		--a;
		System.out.println(a);
		a--;
		System.out.println(a); */
		
		//regular Conditional operator
		/*
		int a = 50;
		int b = 60;
		if (a==50) {
			System.out.println("a is equal to 50");			
		}
		if (a != b) {
			System.out.println("a is not equals to b");
		}
		if (a > b) {
			System.out.println("a is grater than b");
		}
		if (a<b) {
			System.out.println("a is less than b");
		}
		if (a >= 50) {
			System.out.println("a is grater than or equals to 50");
		}
		if (b <= 60) {
			System.out.println("b is less than or equals to 60");
		}
		if((a==50) && (b==60)){
		System.out.println("a is equals to 50 and b is equals to 60");
		}
		if((a==60) || (b==60)){
		System.out.println("b is equals to 60");
		}
		
		
		*/
		//regular if else condition
		
		/*
		int a = 10;
		if (a==5) {
			System.out.println("a is equals to 5");
		}else {
			System.out.println("a is not equals to 5");
		}
		*/
		
		// nested if else
		/*
		int a = 15;
		int b = 20;
		if (a>b) {
			System.out.println("a is grater than b");
			if (a==15) {
				System.out.println("a is equals to 15");
			}else {
				System.out.println("a is not equals to 15");
			}if (b>a) {
				System.out.println("b is grater than a");
			}else {
				System.out.println("b is not grater than a");
			}
		}else {
			System.out.println("a is not grater than b");
		}
		*/
		
		//if ,else if
		/*
		int number = 60;
		String grade;
		
		if (number>90) {
			grade = "your grade is A";
		}
		else if (number>80) {
			grade = "your grade is B";
		}
		else if (number>70) {
			grade = "your grade is C";
		}
		else if (number>= 60) {
			grade = "your grade is D";
		}
		else {
			grade = "your grade is F";
		}
		
		System.out.println(grade);
		*/
		
		//switch case
		
		/*int number = 2;
		String foodname;
		switch (number) {
		
		case 1: foodname = "french fry";
		break;
		case 2: foodname = "rice";
		break;
		case 3: foodname = "dal";
		break;
		default: foodname = "not on the list";
		break;
		}
		
		System.out.println("your order number is " + foodname);
		*/
		
		//for loop
		for(int i=0; i<5; i++) {
			System.out.println("Mango " + i);
		}
		
		//if else inside for loop
		//find even or odd number.
		for(int a=0; a<10; a++) {
			if (a%2 == 0) {
				System.out.println(a + " is an even number");
			} else {
				System.out.println(a + " is an odd number");
			}
		}
		
		//nested for loop
		for (int i = 0; i <3; i++) {
			
			System.out.println("beginning of the phase is " + i);
			
			for (int j = 0; j <2; j++) {
				
				System.out.println("i value is " + i + " and j value is " + j);
				
			}System.out.println("end of the phase is " + i + "\n");
			
			
		}
		for(int i=1 ; i<5 ; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
