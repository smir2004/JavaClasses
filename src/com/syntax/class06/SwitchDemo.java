package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char choice='7';
String meaning = null;
//variable and matching cases must be of same type
switch(choice) {
case'y':
	meaning="Yes";
	break;
case'm':
	meaning="Maybe";
	break;
case'n':
	meaning="No";
	break;
	default:
		meaning="Unknown";
}
System.out.println(meaning);
	}

}
