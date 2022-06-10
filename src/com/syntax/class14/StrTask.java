package com.syntax.class14;

public class StrTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create str with comb of alpha numeric characters 
		String str="dgdfg3535#@$@";
		System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
		
	}

}
