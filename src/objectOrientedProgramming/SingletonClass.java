package objectOrientedProgramming;

public class SingletonClass {
	//singleton class is used to limit object creation.
	// rule is , we need create a private constructor of the class to make it singleton class;
	
	//also rule is to make some global variables to create private constructor of the class.
	/*int number;
	String name;
	
	private SingletonClass() {
		this.number = 20;
		this.name = "alex";
	}
	
	private static SingletonClass instance = new SingletonClass(); //this is the instance of this class.
	
	public static SingletonClass getInstance() { //this is a static return method to call it from another class by the class name.
		
		return instance;
		
	}
	
	
	public void doSomething() {
		System.out.println("we are learning singleton class");
	}*/
	
	
	
	String name = "Alex";
	int age = 20;
	
	private SingletonClass() {
		
	}
	
	private static SingletonClass obj = new SingletonClass();
	
	
	public static SingletonClass getInstance() {
		return obj;
	}
	
	
	public void doSummation() {
		int a = 20;
		int b = 25;
		int total = a+b;
		System.out.println(" final suaamtion result is " + total);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
