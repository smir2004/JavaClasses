package com.syntax.class14;

public class HW2MethodOddOrEven {
//create a mthod that will take 
//	a number and print whether the number is even or odd
	void oddOrEven(int num) {
		if (num%2==0) {
			System.out.println(num+ " is even");
		}else {
			System.out.println(num+ " is odd");
		}
	}
	public static void main(String[] args) {
		HW2MethodOddOrEven num=new HW2MethodOddOrEven();
		num.oddOrEven(4);
	}
}
