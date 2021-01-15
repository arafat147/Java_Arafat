package objectOrientedProgramming;

public class TestMain {

	public static void main(String[] args) {
		//to create object of singleton class we dont need to put the new keyword
		/*
		SingletonClass sc = SingletonClass.getInstance();
		sc.doSummation();
		
		
		*/
		
		//SingletonDemo class:
		SingletonDemo obj = SingletonDemo.getInstance();
		obj.doSummation(50, 10);
		obj.name = "Alex";
		obj.age = 25;
		System.out.println("Singleton name is  " + obj.name + " and singleton age is " + obj.age);
		
		//GetterAndSetter class:
		GetterAndSetter gs = new GetterAndSetter();
		
		gs.setMobilename("iphoneX-Max-Pro");
		System.out.println(gs.getMobilename());
		
		gs.setMobileBrand("Apple");
		System.out.println(gs.getMobileBrand());
		
		gs.setMobilePrice(1199.99);
		System.out.println(gs.getMobilePrice());
		
	}

}
