package javaBasics;

public class FindBiggestNumber {
	
	
	
	public int biggestNumber() {
		
		int a = 50;
		int b = 90;
		int c = 70;
		int d = 80;
		int e = 85;
		
		return Math.max(Math.max((Math.max(Math.max(a, b),c)),d),e);
		
		
	}
	

	public static void main(String[] args) {
		
		FindBiggestNumber obj = new FindBiggestNumber();
		System.out.println("biggest number is " + obj.biggestNumber());
		
	}

}
