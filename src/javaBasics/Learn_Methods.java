package javaBasics;

public class Learn_Methods {
	
	
	//methods can have 2 types: return and non return type
	
	//return type- parameterized and non parameterized
	//non return type- parameterized and non parameterized
	
	//#######  Return type methods:
	
	//1.parameterized Return Type:
	
	public int doSummation(int x, int y) {
		
		System.out.println("This is parameterized return type method");
		int z = x + y;
		System.out.println(z);
		return z;
	}
	
	public String text(String name) {
		
		String s = "Selenium";
		System.out.println(name + s);
		return s;
		
	}
	
	public String test(String testName) {
		
		String a = "QA";
		System.out.println(testName + a);
		return a;
	}
	
	
	//2.non parameterized return type
	
	public int doMultiplication() {
		int a = 25;
		int b = 5;
		int total = a*b;
		System.out.println("value of multiplication is " + total);
		return b;		
	}
	
	public String stName() {
		
		String a = "Alex";
		System.out.println("student name is " + a);
		return a;
		
	}
	
	//#### Non Return type:
	
	//1.parameterized non return type:
	
	public void doAddition(int a, int b) {
		int c = a+b;
		System.out.println("addition of 2 integer value is " + c);
	}
	
	public void doSubtraction(int a , int b ) {
		int num1 = a;
		int num2 = b;
		int total = num1 - num2;
		System.out.println("value of Subtraction is " + total);
	}
	
	//2. non parameterized non return type:
	public void tvDisplay() {
		System.out.println("tv display is 4k UHD");
	}
	
	public static void main(String[] args) {
		
		Learn_Methods lm = new Learn_Methods();
		//lm.doSummation(50, 25);
//		lm.text("name of the class is ");
//		lm.test("Name of the test is ");
		lm.doMultiplication();
		lm.stName();
//		System.out.println("###########################");
//		lm.doAddition(10, 15);
//		lm.doSubtraction(75, 50);
//		lm.tvDisplay();

	}

}
