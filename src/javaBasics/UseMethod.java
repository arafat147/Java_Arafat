package javaBasics;

public class UseMethod {
	//what is method?
	/**
	 *A method is a block of code which only runs when it is called.
	 */
	
	/**
	 * it is of 2 types-
	 * 1. return type 
	 * 2. non return or void type
	 */
	 //1. Return type method
	/**
	 * is 2 type-
	 * i. parameterized return type
	 * ii. non parameterized return type
	 */
	// i. non parameterized return type method example
	public int doSummation() {
		int num1 = 10;
		int num2 = 20;
		int total = num1 + num2;
		
		System.out.println("final result of summation is " + total);
		return total;
	}
	
	//ii. parameterized return type method
	public double marks(double num1, double num2) {
		double number1 = num1;
		double number2 = num2;
		double total = number1 + number2;
		System.out.println("final marks of two class are " + total);
		return total;
	}
	
	//2.non return type method 
	/**
	 * it is also of 2 type
	 * i.  non parameterized non return type
	 * ii. parameterized non return type
	 */
	
	//i.  non parameterized non return type
	
	public void doSubtraction() {
		int num1 = 50;
		int num2 = 25;
		int total = num1 - num2;
		System.out.println("final result of subtraction is " + total);
	}
	
	//ii. parameterized non return type method
	public void doMultiply(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int total = number1 * number2;
		System.out.println("finalic value of multiply is " + total);
	}
	//parameterized static return type method 
	public static int doFunction(int num1, int num2){
		int number1 = num1;
		int number2 = num2;
		int total = number1*number2;
		System.out.println(total);
		return total;
	}
	////non-parameterized static return type method 
	public static int tvSize() {
		int a = 50;
		int b = 75;
		int total = a + b;
		System.out.println("total tv size is = " + total);
		return total;
		
	}
	
	public void apt(){
		String aptSize = " 1354 sq ft.";
		double bathroom = 1.5;
		int rent = 1500;
		boolean isSecured = true;
		System.out.println("apartment size is "+ aptSize + "total number of bathroomes are "+ bathroom + " rent is " + rent +"is the apartment secured? " + isSecured);
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		UseMethod obj = new UseMethod();
		obj.doSummation();
		obj.marks(95.2, 85.9);
		obj.doSubtraction();
		obj.doMultiply(15, 3);
		obj.apt();
		
		UseMethod.tvSize();
		UseMethod.doFunction(15, 15);
		
	}

}
