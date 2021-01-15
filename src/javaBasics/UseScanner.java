package javaBasics;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name	 = input.nextLine();
		System.out.println("My name is " + name);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = input2.nextInt();
		System.out.println("my age is " + age);
		
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your ID " );
		int id = input3.nextInt();
		System.out.println("my id is " + id);
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter your salary ");
		double salary = input4.nextDouble();
		System.out.println("my salary is " + salary);
		
		input.close();
		input2.close();
		input3.close();
		input4.close();
		
		
	}

}
