package javaBasics;

public class ConditionalOperator {
	
	
	
	public static void main(String[] args) {
		
		//Conditional Operator
		// && and operator
		// || or operator
		
		int a = 50;
		int b = 60;
		//and operator- for and operator, both condition has to be true to get printline
		if( (a==50) && (b==60)   ) {
			System.out.println("a is 50 and b is 60");
		}
		//this code will not execute bcz it did not fulfill the condition for "a" thats why it did not print
		if((a != 40 ) && (b!= 60)) {
			System.out.println("a is not equal to 40 and b is not equal to 60");
		}
		//or operator- for or operator , if either condition matches, then it will generate the printline
		if ((a>30)||(b>60)) {
			System.out.println("a is greater than 30 and b is greater than 60");
		}
		
		
	}

}
