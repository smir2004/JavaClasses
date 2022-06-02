package com.syntax.class06;

import java.util.Scanner;

public class Hw4Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for sale: yes or no"); 
	
		String ans=scanner.next();
		int discount=0;
		
		if(ans.equals("yes")) {
		
		System.out.println("Which item you want to buy?");
	 	String item=scanner.next();
		System.out.println("What is the price?");
		int price=scanner.nextInt();
	    int  result = 0;
        if (price<20) {
	    discount=20;
        result=price-(price*10/100);
        System.out.println("After discount of "+discount+"% the price of the item will reduce from "+price+" to "+result+"$");
        } else if (price>=20 && price<=100) {
    	    discount=20;
            result=price-(price*20/100);
            System.out.println("After discount of "+discount+"% the price of the item will reduce from "+price+" to "+result+"$");
        	
        }else if (price>=100 && price<=500) {
    	    discount=30;
            result=price-(price*30/100);
            System.out.println("After discount of "+discount+"% the price of the item will reduce from "+price+" to "+result+"$");
        	
        }else if (price>=500) {
    	    discount=50;
            result=price-(price*50/100);
        
        System.out.println("After discount of "+discount+"% the price of the item will reduce from "+price+" to "+result+"$");
  		
  	} 
  		

  	} else if (ans.equals("no")) {
  		System.out.println("Too bad! You are not going for shopping");
  	}
		scanner.close();
	}
}

