package com.syntax.class05;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		////2. Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? If balance of the card is larger than 1000, tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.
		Scanner scan=new Scanner(System.in);
		System.out.println("do you have credit card?yes or no");
		String creditCard=scan.nextLine();

		System.out.println(creditCard);
	
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("what is balance on the card?");
		}else
			System.out.println("We will offer you credit card");
		
		
		int balance=scan.nextInt();
		System.out.println(balance);
		
		if (balance>=10) {
			System.out.println("they can spend more");
		}else {
			System.out.println("pleae pay off immedietly");
		}
	}
	

}
