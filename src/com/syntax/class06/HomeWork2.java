package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other 
		//grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
		Scanner scan=new Scanner(System.in);
		String grade, explanation;
		System.out.println("Please enter grade, 'A', 'B' or 'C' etc.");
		grade=scan.nextLine();
		
		switch(grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
		case "F":
			explanation="Fail";
			break;
			default:
				explanation="not acceptable";
	}
		System.out.println("Your grade is "+grade+" and your performance is "+explanation);

		scan.close();
	}

	}


