package oopAbstractionAndInterface;

public interface Car {

	//interface is a prototype or guideline used in future
	//interface is 100% abstract
	//it can have declared methods only. we can not use method body
	
	public void carBrand();
	public void carWheel();
	public void carEngine();
	// method body will show error
	//public void carStart() {
		
	//}
	
	//we must have to declare a variable and initialize it
	String name = "BMW";
	//we cannot just declare a variable in interface.
	//String stName;
	
	
	
	
	
	
	
	
	
	
	
	
}
