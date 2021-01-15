package objectOrientedProgramming;

public class TryCatch {

	public static void main(String[] args) {
		
		//try catch is used to do exception handling:
		//Arithmetic Exception.
		try {
			int a = 5;
			int b = 0;
			int total = a/b;
			System.out.println(total);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("this is arithmetic exception");
		}
		
		
		
		
		
	}

}
