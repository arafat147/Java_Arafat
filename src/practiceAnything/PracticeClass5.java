package practiceAnything;

public class PracticeClass5 {
	
	//return method:
	public int doSummation() {
		int a =5;
		int b = 10;
		int total = a + b;
		System.out.println("final summation result is " + total);
		return total;
	}
	public static int doSubtraction(int num1 , int num2) {
		int number1 = num1;
		int number2 = num2;
		int total = number1 - number2;
		System.out.println("final subtraction result is " + total);
		return total;
	}

	public static void main(String[] args) {
		PracticeClass5 obj = new PracticeClass5();
		obj.doSummation();
		PracticeClass5.doSubtraction(15, 10); 
		
		
		
	}

}
