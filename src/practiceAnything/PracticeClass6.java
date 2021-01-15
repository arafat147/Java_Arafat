package practiceAnything;

import java.util.Scanner;

public class PracticeClass6 {

	public static void main(String[] args) {
		// write a code that asks to input 3 numbers and then write a code to validate 
		//if those input numbers are in increse or decrese order.
		Scanner obj = new Scanner(System.in);
		System.out.println("input the first number ");
		int number1 = obj.nextInt();
		System.out.println("input second number ");
		int number2 = obj.nextInt();
		System.out.println("input third number ");
		int number3 = obj.nextInt();
		if ((number1 < number2) && (number2 < number3)) {
			System.out.println("the numbers are in increse order ");
		}else if((number1 > number2 ) && (number2 > number3	)) {
			System.out.println("the numbers are in decrese order");
		}else {
			System.out.println("neither increse or decrese");
		}

	}

}
