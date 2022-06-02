package com.syntax.class05;
import java.util.Scanner;
public class LogicalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		String word=scanner.nextLine();
		int int1 = 0;
		int int2 = 0;
		String word1 = null;
		String word2 = null;
		System.out.println("Please enter two letters");
		System.out.println("Please enter two numbers");
		if (int1== int2 && word1==word2){
		  System.out.println("AND");
		}else if (int1==int2 || word1== word2){
		  System.out.println("OR");
		} else if (int1!=int2 || word1!=word2){
		  System.out.println("NONE");
		}
				
	}

}
