package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// not operator reverse the condition
boolean boo=!true;
System.out.println(boo);
boolean boo1=true;
System.out.println(boo1);

boolean traffic=false;
if(!traffic) {
	System.out.println("i will reach work on time");
}else { System.out.println("i will be late");
	}
String name="Emre";
if (!name.equals("Emre")) {
	System.out.println("you are not Emre, and i need Emre");
}else {
	System.out.println("Hi! Emre!!");
}
}
}
