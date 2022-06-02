package com.syntax.class06;

public class SwithchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if is a conditioned based statement

		int day = 9;
		String name;

		if (day == 1) {
		name ="Monday";
		} else if (day == 2) {
		name = "Tuesday";
		} else if (day == 3) {
		name = "Wedndesay";
		} else if (day == 4) {
		name ="Thurdsay";
		} else if (day == 5) {
		name = "Friday";
		} else if (day == 6) {
		name = "Saturday";
		} else if (day == 7) {
		name = "Sunday";
		} else {          //always last block
		name = "Invalid";
		}

		System.out.println(name);

		System.out.println("----------------");
		//switch The switch statement or switch case in java is a multi-way branch statement. Based on the value of 
				//the expression given, different parts of code can be executed quickly. The given expression can be of a primitive data type 
				//such as int, char, short, byte, and char.
				//faster and cleaner. valuebased statement.
		switch (day) { 

		case 1:
		name = "Monday";
		break;
		case 2:
		name = "Tuesday";
		break;
		case 3:
		name = "Wednesday";
		break;
		case 4:
		name ="Thursday";
		break;
		case 5:
		name = "Friday";
		break;
		case 6:
		name = "Saturday";
	    break;
		case 7:
		name = "Sunday";
		break;
		default:               /////can be anywhere
		name = "Invalid"; //if default is last then doesnt need break;
		
		}

		System.out.println(name);
		}
		}

	



