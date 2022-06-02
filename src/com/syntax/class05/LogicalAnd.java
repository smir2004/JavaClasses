package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean job=false;
double salary=100000;
if(job&&salary>=100000) {
	System.out.println("i am will be super duper happy");
	
}
System.out.println("---------------------------");

boolean study=true;
boolean homework=false;
boolean practice=true;
if(study && homework &&practice) {
	System.out.println("you will succed in the course");
}else {
	System.out.println("you will struggle");
}
System.out.println("------------------------");
int num1=65;
int num2=93;
int num3=73;
if(num1>num2&& num1>num3) {
	System.out.println("The largest number is "+num1);
	
}else if (num3> num1&& num3>num2) {
	System.out.println("the largest number is "+num3);
} else if (num2>num1&& num2>num3) {
	System.out.println("largest number is "+num2);
}

	}

}
