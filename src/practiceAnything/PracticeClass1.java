package practiceAnything;

public class PracticeClass1 {
	
	//Datatype: 1. primitive and 2. non primitive
	//primitive datatype- byte, int, double,float, char, boolean,short, long.
	//non primitive:String, array,etc.
	
	//Method- is a block of code that executes only when it is called.
	//Methods are of mainly two types- return and non return 
	// both of them can be parameterized and non parameterized. static and non static
	//examples:Return type
	
	//1. parameterized return type method:
	public int doAddition(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int total = number1 + number2;
		System.out.println("final addition value is " + total);
		return total;
	}
	
	//2.non parameterized return type:
	public double tvInfo() {
		String brand = "Samsung";
		double tvsize = 65.5;
		System.out.println("TV brand is "+ brand + " And TV size is " + tvsize);
		return tvsize;
	}
	//examples:non return type
	
	//1.parameterized non return type
	public void doDivision(int num1, int num2) {
		int a = num1;
		int b = num2;
		int total = a/b;
		System.out.println("final result is " + total);
	}
	//2.non parameterized non return type
	public void phone() {
	String brand = "Apple";
	int size = 6;
	double price = 1200.50;
	System.out.println(brand + size + price);
	}
	//above methods are non static methods and they should be called by creating the object of the class.
	
	//parameterized or non parameterized static method
	public static int doStatic(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int total = number1*number2;
		System.out.println(total);
		return total;
	}
	
	//Construcrtor
	//instance or global variable-
	String aptName;
	double people;
	public PracticeClass1(String aptName, double people) {
		this.aptName = aptName;
		this.people = people;
		System.out.println("apt name is "+aptName +" and number of people living is "+ people);
	}
	

	public static void main(String[] args) {

	PracticeClass1 obj = new PracticeClass1("B2",5);//object of the class
	PracticeClass1 obj2 = new PracticeClass1("A4",3);
	
	obj.doAddition(50, 15);//parameterized return type
	obj.tvInfo();//non-parameterized return type
	
	obj.doDivision(50, 5);//parameterized non return type
	obj.phone();//non parameterized non return type
	
	
	PracticeClass1.doStatic(25, 5);//we can call it by its class name cz its static method.

}
}
