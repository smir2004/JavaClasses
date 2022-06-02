package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {



	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String season= scan.nextLine();
		
		if (season.equalsIgnoreCase("December") || season.equalsIgnoreCase("January") || season.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (season.equalsIgnoreCase("March") || season.equalsIgnoreCase("April") || season.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (season.equalsIgnoreCase("June") || season.equalsIgnoreCase("July") || season.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (season.equalsIgnoreCase("September") || season.equalsIgnoreCase("October") || season.equalsIgnoreCase("November")) {
			season = "Autumn";
		} else {
		
			System.out.println("that month is invalid");
		}
		
		System.out.println("You were born in "+season);

	}

}

