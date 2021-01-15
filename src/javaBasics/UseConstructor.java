package javaBasics;

public class UseConstructor {
	
	//what is constructor?
	/**
	 * constructor is used to perform initialization of an object.
	 */
	//Syntax:
	//access modifier + Constructor name(which is the class name always) + () +{}
	
	
	public UseConstructor() {
		//this is a default constructor cz it is not parameterized 
		
	}
	//parameterized constructor
	// first, we must need some instance/global variables
	
	String name;
	int age;
	double marks;
	
	String tvName;
	int inch;
	double price;
	
	public UseConstructor(String tvName, int inch, double price) {
		this.tvName = tvName;
		this.inch = inch;
		this.price = price;
		System.out.println("tv name is " + tvName +" ,inch is " + inch + "price is " + price);
	}
	
	
	/*public UseConstructor(String name, int age, double marks) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
	System.out.println("student name is " + name + ", age is " + age + " and marks is " + marks);	
		
	}*/
	
	
	//we have to make sure the same pattern does not repeat inside constructors parameter.
	//meaning - the first constructor parameter has string name, int age, double marks.
	//we cannot create another constructor with same pattern. 
	//it can be string double int, or int string double. like that
	//:)
	public UseConstructor(String name, double marks) {
		this.name = name;
		this.marks = marks;
		System.out.println("student name is " + name + " and final exam mark is "+ marks);
		
	}
	
	//there's a shortcut to generate constructor using the variables automatically.
		// right click inside the class then select source then select generate constructor using fields and 
		// it will show you the vaiables you want to create the constructor with!
		// you just need to put the sysout line.
		
		public UseConstructor(int age, double marks) {
		
			this.age = age;
			this.marks = marks;//now we will give the print line here;
			System.out.println("age is " + age + " " + "and marks is " + marks);
		}
	
	

	public static void main(String[] args) {
		
		//to use constructor we need to create an object
		UseConstructor s1 = new UseConstructor("Sony",55,550.68);
		//UseConstructor s1 = new UseConstructor("arafat",25,90.5);
		
		UseConstructor s2 = new UseConstructor("Alex",88.52);
		
		UseConstructor s3 = new UseConstructor(30, 79.99);
		
		
		
		
		
		
	}

}
