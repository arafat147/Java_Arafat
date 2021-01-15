package objectOrientedProgramming;
import java.util.HashMap;
import java.util.Map;
public class UseHashmap {
	
	
	public static void printFreq(int []arr) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< arr.length; i++) {
			Integer c = hmap.get(arr[i]);
			
		if(hmap.get(arr[i]) == null)
			hmap.put(arr[i], 1);
		else
			hmap.put(arr[i], ++c);
		
		for(Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " : " + m.getValue());
		
		
		}
				
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,25,10,25,30,100,10,25};
		printFreq(arr);
		
	}
	

}
