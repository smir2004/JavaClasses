package com.syntax.class05;

import java.util.Scanner;

public class DmvScanner {

	public static void main(String[] args) {



Scanner scan=new Scanner(System.in);
System.out.println("Please enter your age");
int age=scan.nextInt();
if(age>=18) {
	System.out.println("You will get a driver licence to issued to you");
}else {
	System.out.println("You will recieve learners permit");
}


	}

}
