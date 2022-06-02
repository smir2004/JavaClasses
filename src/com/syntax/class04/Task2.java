package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		boolean diploma= true;
		double gpa=2;
		if (diploma) {
			System.out.println("Congratulations!");
			if (gpa>=3.5) {
				System.out.println("you are eligble for scholarship");
			} else if (gpa<3.4) {
				System.out.println("you should've studied harder");
			}
		}else { System.out.println("get a degree");
		}
	}

}
