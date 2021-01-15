package javaBasics;

import java.util.Scanner;

public class UseSwitchCase {

	public static void main(String[] args) {

		int number = 2;
		String foodname;
		
		switch(number) {
		case 1: foodname = "polao";
		break;
		case 2: foodname = "roast";
		break;
		case 3: foodname = "fried rice";
		break;
		case 4: foodname = "coke";
		break;
		default : foodname = "Invalid";
		
		}
		
		System.out.println("your order name is " + foodname);
		
		
		//practice 1:
		int number2 = 2;
		String phone;
		
		switch(number2) {
		case 1: phone ="iphone";
		break;
		case 2: phone ="samsung";
		break;
		case 3: phone ="nokia";
		break;
		default: phone = " not found";
		break;
		
		}
		System.out.println("your phone is " + phone);
		
		int number3 =4;
		String tvName;
		switch(number3) {
		case 1: tvName ="Samsung";
		break;
		case 2: tvName ="Lg";
		break;
		case 3: tvName ="sony";
		break;
		case 4: tvName ="vizio";
		break;
		default: tvName = "not found";
		break;
		}
		System.out.println("your tv is " + tvName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
