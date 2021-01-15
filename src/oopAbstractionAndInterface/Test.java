package oopAbstractionAndInterface;

public class Test {

	public static void main(String[] args) {
		
		
		Bmw bmw = new Bmw();
		
		bmw.carBrand();//came from car class
		bmw.carEngine();//came from car class
		bmw.carWheel();//came from car class
		
		bmw.carDisplay();//came from Bmw class
		
		bmw.flyingEngine();//came from FlyingCar class
		bmw.flyingFeature();//came from FlyingCar class
		bmw.flyingFuel();//came from FlyingCar class
		
	}

}
