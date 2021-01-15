package javaBasics;

public class UseIfElse {

	
	
	public static void main(String[] args) {
		
		//control flow:
		// if...else
		//if elseif...else
		//nested if...else
		
		
		//1. if else //if the first condition fulfills then it will go to sysout. otherwise it will go to else sysout.
		int a = 70;
		int b = 60;
		if(a==60) {
			System.out.println("value is = 70");
		}else {
			System.out.println("value of a is not 70");
		}
		
		//nested ifElse
		
		if (a == 50 ) {
			System.out.println("value of a is 50 ");
				if(b==60) {
					System.out.println("value of b is 60");
				}else {
					System.out.println("value of b is not 60");
				}
		}else {
			System.out.println("value is not 70");
		}
		//***on the above code, if the first condition or  the parent is not true, it will not go inside the child condition
		//*** if parent condition is true then it will go to child condition
		
		
		
		
		
		
	}
	
	
	
}
