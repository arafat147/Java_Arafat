package objectOrientedProgramming;

public class SingletonDemo {

	String name;
	int age;
	
	private SingletonDemo() {
		
	}
	
	private static SingletonDemo sd = new SingletonDemo();
	
	public static SingletonDemo getInstance() {
		return sd;
	}
	
	public void doSummation(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int total = number1/number2;
		System.out.println("summation result is " + total );
	}
	
	
}
