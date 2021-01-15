package practiceAnything;

import java.util.Scanner;

public class PracticeClass7 {

	public static void main(String[] args) {

		//write a for loop code that will ask for an input for row number and then show the code like this:
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		
		Scanner number = new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int numberOfRow = number.nextInt();
		
		for(int i=1; i<numberOfRow; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
