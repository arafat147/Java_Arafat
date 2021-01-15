package javaBasics;

import java.util.ArrayList;
import java.util.List;

public class UseArrayLIst {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		
		//adding method in arraylist 
		nameList.add("Arafat");
		nameList.add("tareq");
		nameList.add("rasel");
		//to call this list, we can do 2 ways:-
		
		//1. sout:
		System.out.println(nameList);
		
		//or 2. we can create a for each loop:
		for(String name : nameList) {
			System.out.println(name);
		}
		for(String name2 : nameList) {
			System.out.println(name2);
		}
		
		
		
		
		
		
		
		
		
	}

}
