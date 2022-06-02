package com.syntax.review2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please Enter your name"); ////scanner class checking in buffer
// string type of input
String name=scanner.nextLine();
System.out.println("Please enter your age"); ////integer type of input
int age=scanner.nextInt();
//String newLine=scanner.nextLine(); only used if int is before the string

System.out.println(name+age);
scanner.close();
	}

}
