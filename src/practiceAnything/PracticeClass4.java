package practiceAnything;

public class PracticeClass4 {
	
	
	
	public static void main(String[] args) {
		
		int number = 2;
		String foodname;
		
		switch(number) {
		case 1: foodname = "rice";
		break;
		case 2: foodname = "dal";
		break;
		case 3: foodname = "rupchanda";
		break;
		default: foodname = "not found";
		break;
		}System.out.println("your order number is " + foodname);
		
		
		for(int i=0; i<2; i++) {
			System.out.println("i value is " + i);
			for(int j = 0; j<2; j++) {
				System.out.println("i value is " + i + "and j value is " + j);
			}
		}
				
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

