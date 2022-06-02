package com.syntax.class05;

public class Donor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		int weight=110;
		if (age>=18) {
			if (weight>=110) {
			System.out.println("You are "+age+" years old and your weight is "+weight);
			System.out.println("You are eligible to be a donor");
		} else {
			System.out.println("You are "+age+" years old and you weigh"+weight);
			System.out.println("You are not eligible to be a donor");
		}

	}

}
}
