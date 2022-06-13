package com.syntax.class14;


public class EmailBaby {
	//Create a method createEmail(). Based on values of users name, lastName and email type, 
	//your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	String completeEmail( String userName, String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}
	
		

	public static void main(String[] args) {
		EmailBaby task1=new EmailBaby();
		System.out.println(task1.completeEmail("tara", "Stara", "gmail"));
}
	}