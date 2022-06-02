package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		// wrtite a prog tp check whether number is positive or negative
		int a=0; //variable declaration
		
		if (a> 0) { //putting condition
			System.out.println(a+" is positive");
		} else if (a==0) {
			System.out.println(a+" is not positive or negative");
		} else {System.out.println(a+" is negative");
		}
		String  browser="chrome";
		if (browser=="chrome") {
			System.out.println("All test cases wll be excecuted on "+browser);
		} else { System.out.println("I am not executing any test cases");
		System.out.println("Reason-wrong browser");
		}
		int day=7;
if (day==1) {
	System.out.println("Monday");
	
}else if (day==2) {
	System.out.println("Tuesday");
} else if (day==3) {
	System.out.println("Wednesday");
}else if (day==4) {
	System.out.println("Thursday");
} else if (day==5) {
	System.out.println("Friday");
} else if (day==6) {
	System.out.println("Saturday");
} else if (day==7) {
	System.out.println("Sunday");
}
	}

}
