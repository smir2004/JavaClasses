package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		

		Scanner scan=new Scanner(System.in);
		String country, language;
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "austria":
			language="German";
			break;
		case "mexico":
			language="Spanish";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Pakistan":
			language="Urdu";
			break;
		case "Eygpt":
			language="Arabic";
			break;
			default:
				language="unknown";
	}
		System.out.println("You are from "+country+" and your language is "+language);
		scan.close();

	}

	}

