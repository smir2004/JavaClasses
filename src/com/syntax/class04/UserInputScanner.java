package com.syntax.class04;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		
	
	Scanner input=new  Scanner(System.in);
	System.out.println("Please enter your name");//we need grab the value from console
	String name=input.next();
	System.out.println(name);
	System.out.println(name+" please enter your age");
	int age=input.nextInt();
	
	System.out.println(name+" Please tell me your grade level");
	int grade=input.nextInt();
	System.out.println("wow that is amazing");

	}

}
