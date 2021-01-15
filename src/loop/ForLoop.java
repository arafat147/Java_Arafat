package loop;

public class ForLoop {

	public static void main(String[] args) {
		
		
		//for loop: if u know exactly how many time u want to repeat then you should use for loop. 
		
		
		
		//structure:
		//for(initialization(which is starting point) + ; + condition (end point) + ; + increment/decrement){..statement..}
				
				
		// here is the loop life cycle:
		// in for loop, initialization executes only once.
		//then it goes to condition,
		//after condition it goes to loop body. 
		// from loop body, it prints the loop body statement 
		// from there it goes to increment/decrement part
		// from there it condition part again. and repeates as same 
		//so we can say that- 
		//1.initialozation-->2.condition-->3.loop body-->4.increment/decrement-->from there it goes to condition again and follow 1,2,3,4 points in this line
		//
		for(int i=0; i<10; i++) {
			System.out.println("mango" + i);
		}
		//find even and odd number	
		for(int a=0; a<10; a++) {
			
			if (a%2==0) {
				System.out.println(a + " is an even number");
			}else {
				System.out.println(a + " is an odd number");
			}
		}
		
		//Nested for loop.
		for (int i = 0; i < 4; i++) {
			System.out.println("Beginning of the phase is " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("i value is " + i + " j value is " + j);
			}System.out.println("ending phase is " + i + "\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
