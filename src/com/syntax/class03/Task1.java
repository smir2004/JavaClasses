package com.syntax.class03;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variable and increase it’s value by 500 and then by 200 using shorthand operator
		// Declare variable and decrease it’s value by 60 using shorthand operator
		// Declare variable cakePiece=11 and divide the value of that variable between 4 people using shorthand operator
		// Declare variable cake=25 and divide cake between 7 people . Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people

int num=20;
num+=500;
System.out.println(num);
num+=200;
System.out.println(num);
int num1=200;
num1-=60;
System.out.println(num1);
int cakepiece=11;
cakepiece/=4;
System.out.println(cakepiece);
int cake=25;
cake/=7;
System.out.println(cake);
cake%=7;
System.out.println("There will be " +cake+ " pieces of cake left after it was distributed equally among 7 people");

		
	}

}
