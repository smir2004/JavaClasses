package com.syntax.class14;

public class Strngmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I never forget about recording";
System.out.println(str.replace("never","always").replace("I", "Asghar"));//multple methods on same line is called method chaining
str="8o7687tuguftrtd65465tchghgfyt";
System.out.println(str.replaceAll( "[0-9]",""));
String str2="Batch 13 is Great. Batch 13 is Best. Batch 13 is Excellant";
String[] arr=str2.split("[.]");

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
	}

}
