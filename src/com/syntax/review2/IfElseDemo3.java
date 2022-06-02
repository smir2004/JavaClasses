package com.syntax.review2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please Enter your account balance");
double accountBalance=scanner.nextDouble();
System.out.println("Plese enter the amount that you want to lend to your friend");
double amountToLend=scanner.nextDouble();
if (accountBalance>=amountToLend) {
	System.out.println("yes i can help you");
	
} else {
	System.out.println("Sorry i dont have enough money to help you");
}
scanner.close();
	}

}
