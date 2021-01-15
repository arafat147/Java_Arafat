package oopAbstractionAndInterface;

public abstract class FlyingCar {
	
	//to make a class abstract, we have to write abstract before the class name;
	//if we declare a method is abstract, in a abstract class, then we can not declare the body:
	public abstract void flyingFeature();
	public abstract void flyingFuel();
	
	//but we can create non abstract method / regular method in abstract class with body.(example 1) but cannot just declare any method without using the abstract keyword( example 2 ) 

	//example 1
	public void flyingEngine() {
		
		String engineName = "V6";
		System.out.println(engineName);
	}
	//example 2:
	//public void flyingWheel();
	
	
	
	
	
	
	
	
	
}
