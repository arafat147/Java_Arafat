package oopAbstractionAndInterface;

public class Bmw extends FlyingCar implements Car,NewCar{
	
	
	//a class can extend only one class. but can implement multiple interface.
	
	
	
	//next 3 methods came from car class interface
	public void carBrand() {
		
		System.out.println("BMW is the brand name of the company");
		
	}

	
	public void carWheel() {
		
		System.out.println("BMW car will have 6 wheels");
		
	}


	public void carEngine() {
		
		System.out.println("BMW car engine will have 6 cilinder engine");
		
	}
	//we can create mthods in this class as well.
	public void carDisplay() {
		
		System.out.println("BMW will have a 10 inch touch screen display");
		
	}


	//next 2 methods came from new car class.
	public void backCamera() {
		System.out.println("BMW car will have multiple back cameras");
		
	}



	public void breakHold() {
		System.out.println("BMW will have break hold system");
		
	}


	//next 2 methods came from flying car class because bmw class extends flying car abstract class
	public void flyingFeature() {
		System.out.println("BMW will have flying feature");
		
	}


	
	public void flyingFuel() {
		System.out.println("BMW will have octane type fuel in their flying car");
		
	}

}
