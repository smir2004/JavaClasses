package com.syntax.class13;

public class TuesdayClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create String and if string empty 
		//if the string has an odd number of charc and has 3 or more charach. print the char in the middle of the string
		String stry=new String("Hello");
		String str2="Hello"; //this is preferred
		if(!str2.isEmpty()) {
			if (str2.length()%2!=0&&str2.length()>=3) {
				int middle=str2.length()/2;
				System.out.println(str2.charAt(middle));
			}
		}
	}

}
