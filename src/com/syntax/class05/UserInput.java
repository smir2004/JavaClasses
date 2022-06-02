package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
Scanner scans=new Scanner(System.in);
System.out.println("Please enter name");
String name=scans.nextLine();

System.out.println(name);

System.out.println("please enter age");
int age=scans.nextInt();
System.out.println(age);

System.out.println("please enter price");
double price=scans.nextDouble();
System.out.println(price);

System.out.println("please enter boolean");
boolean boo=scans.nextBoolean();
System.out.println(boo);

System.out.println("please enter any character");

char character=scans.next().charAt(0);
System.out.println(character);

	}

}
