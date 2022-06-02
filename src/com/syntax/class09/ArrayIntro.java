package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an array
		int[] b=new int[4];
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		//access value from array
		System.out.println(b[2]);
		System.out.println(b[1]+b[3]);
		// array of classmaes
		String[] classMates=new String[5];
		classMates[0]="Kristina";
		classMates[1]="Sameer";
		classMates[2]="Elexis";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		System.out.println("my classmates name is "+classMates[3]);
	}
	

}
