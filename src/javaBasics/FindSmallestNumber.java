package javaBasics;

public class FindSmallestNumber {

	
	
	
	/*
	 * public int smallestNumber() {
		int number1 = 30;
		int number2 = 40;
		int number3 = 50;
		
		return Math.min(Math.min(number1,number2),number3);
	}
	 */
	
	
	public int findSmallest () {
		
		int a = 50;
		int b= 60;
		int c = 70;
		int d = 80;
		
		return Math.min(Math.min(Math.min(a, b),c),d);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindSmallestNumber obj = new FindSmallestNumber();
		System.out.println("Smallest number is " + obj.findSmallest());
		
	}

}
