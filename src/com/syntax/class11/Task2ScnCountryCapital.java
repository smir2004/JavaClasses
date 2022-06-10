package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2ScnCountryCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the size of aray you want to create");
		int arraySize=scanner.nextInt();
		System.out.println("the size of the array is "+arraySize);
		int[]countryArray=new int[arraySize]; 
		System.out.println("please enter " +arraySize+" countries");
				for(String i=0; i<countryArray.length;i++) {
					countryArray[i]=scanner.nextInt();
				}
				System.out.println(Arrays.toString(countryArray));
				int sum=0;
				for(int element:countryArray) {
					sum=sum+element;
				}
				System.out.println("the sum of all elements is "+sum);
				scanner.close();
	}

}
