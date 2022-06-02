package com.syntax.class06;
import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lets ask the user where is he from
		//based on the country we will define favortie food
		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		System.out.println("please tell me where are you from");
		country=scan.nextLine();
		
		switch(country.toLowerCase()) {
		case "USA":
			favoriteFood="Burgers";
			break;
		case "austria":
			favoriteFood="potato salad";
			break;
		case "mexico":
			favoriteFood="Taco";
			break;
		case "canada":
			favoriteFood="Poutine";
			break;
		case "Turkey":
			favoriteFood="Lahmacun";
			break;
		case "Pakistan":
			favoriteFood="Biryani";
			break;
		case "Eygpt":
			favoriteFood="kohsary";
			break;
			default:
				favoriteFood="unknown";
	}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

	}
}
