package com.syntax.class05;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that will print whether it is a weekend or weekday.
		 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output
		 * “It is a weekend”, any other day → output “Invalid day”*?
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what day of the week is today from 1-7");
		int day=scan.nextInt();
		
	
		if (day>=1 && day<=6) {
			System.out.println("It’s a weekday");
		
		}else if (day==6 && day==6){
			System.out.println("It’s a weekend");
		
		}else {
			System.out.println("Invalid day");
	  
	}

}
}
