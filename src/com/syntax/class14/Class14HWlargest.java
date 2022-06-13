package com.syntax.class14;

public class Class14HWlargest {
	//method to take 2 num and print larger
	void largest(int num1, int num2) {
		if(num1>num2){
			System.out.println(num1+"is largest");
		} else {
			System.out.println(num2+" is largest");
		}
	}
public static void main(String[] args) {
	Class14HWlargest numbers=new Class14HWlargest();
	numbers.largest(7,22);
}
}
