package com.syntax.class06;

public class EnhancedLargestNumber {

	

	public static void main(String[] args) {		

		
		
		int num1=20;
		int num2=20;
		int num3=20;
		int largest = 0; //this variable was initialized by compiler
		/*compiler can initialize variable to its default valuees
		 * int->0
		 * double=>0.0
		 * boolean->false
		 * String->null(all non-primitive all default is null
		 */
		
		if(num1>=num2&& num1>=num3) {
			largest=num1;
			
		}else if (num3>= num1&& num3>=num2) {
			largest=num3;
			
		} else if (num2>=num1&& num2>=num3) {
			largest=num2;//reassign value
		}else {
				System.out.println("All numbers are equal");
			}
		if (largest!=0) {
		System.out.println(largest+" is the largest number");

		//0 is because if all equal then it didnt go in the if block
		
	}

	}
}


