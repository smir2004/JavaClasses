package com.syntax.class09;

public class HwClass9charLOOP {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B 
		//(use 2 different ways of creating an array).
		char[]grade= {'A','B','C','D','E','F'};
		for(int i=0; i<grade.length; i++) {
			System.out.println(grade[2]+" ");
		}
		String[] words = {"Saturday", "is", "Java", "coding", "Day."};
		System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
		System.out.println("-----------");
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
	}
}