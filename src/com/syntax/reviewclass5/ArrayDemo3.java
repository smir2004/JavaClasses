package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size of an array");
int size=scanner.nextInt();
String[]names=new String[size];
for(int i=0;i<names.length;i++) {
	names[i]=scanner.next();
	
}
System.out.println(Arrays.toString(names));
scanner.close();
	}

}
