package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// //6. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the 
		//grade based on the following rules:

		//if the average score >=90 → grade=A
		//if the average score >= 70 and <90 → grade=B
		//if the average score>=50 and <70 → grade=C
		//if the average score<50 → grade=F
Scanner scan = new Scanner(System.in); 

System.out.println("Please enter the quiz score ");

double averageS = 0;
averageS += scan.nextDouble();

System.out.println("Please enter the mid-term score ");
averageS += scan.nextDouble();

System.out.println("Please enter the final score ");
averageS += scan.nextDouble();

averageS /= 3;
char Grade;
if (averageS >= 90) {
	Grade='A';
	
} else if (averageS >= 70 && averageS <=90)
{Grade='B';
	
} else if (averageS >= 50 && averageS <= 70) {
	Grade='C';
	
} else { 
	Grade='F';
}
System.out.println("You are a "+Grade+" student");

if (Grade=='A' || Grade=='B') {
	System.out.println("You are doing great");
}else {
	System.out.println("Please try to study more");
}
	}
	}


