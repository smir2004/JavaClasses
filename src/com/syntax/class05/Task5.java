package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Ask user to enter a number and then define if number is small, medium or large
		//Small number is value between 1 and 10
		//Medium number is value between 11 and 100
		//Large number is value between 101 and 1000
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number ");
		
		int num1 = scan.nextInt();
		
		if(num1 == 1 ||num1 <= 10  ) {
			System.out.println("largeSmall number");
		}else if (num1 == 11 || num1<=100) {
			System.out.println("medium number");
		}else if (num1 >= 101 || num1 <= 1000) {
			System.out.println("Large number");
		}

	}

}
