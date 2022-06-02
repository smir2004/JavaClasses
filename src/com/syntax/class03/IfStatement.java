package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditional statements 'cause and effect'
		double mortgageRate=4.5;
		if (mortgageRate>5) {
		
		System.out.println("I am not buying a house");
		}
		int num1=99;
		int num2=100;
		if (num1>num2) {
				System.out.println(num1+" is bigger than "+num2);
				}
				
		double temp=71;
				if (temp>75) {
					System.out.println("I will go for a walk");
					
				} else {
					System.out.println("I am going to study Java");
					System.out.println("-------------------- ");
				}
				char gender='m';
				if (gender=='f') {
					System.out.println("You like shopping");
				}else {
					System.out.println("You like watching sports");
				}
			boolean breakTime=false;
			if(breakTime) {
				System.out.println("Lets take a break");
			} else {
				System.out.println("Lets continue class");
			}
	}

}
