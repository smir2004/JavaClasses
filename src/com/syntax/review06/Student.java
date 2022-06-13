package com.syntax.review06;

public class Student {
	String name;
	String lastName;
	String address;
	int studentId, age;
	char grade;

	void study() {
		System.out.println("Student "+name+"  is studying");
	}
	void doHomework() {
		System.out.println("Student " +name+"  is doing homework");
	}
	String getFullName() {
	
return  name.toUpperCase()+" "+lastName.toUpperCase();
		
	}
	//create method for full info
	void printInfo() {
	
		System.out.println(name+" "+lastName+" is "+age+" and lives in "+address+" her Id is "+studentId);
	}
	String rating() {
		switch (grade) {
		case 'A':
		
		return "Excellent";
		case 'B':
		return "Good";
		
	case 'C':
		return "Average";
	case 'D':
		 return "Bad";
		
	default:
		return "Not Accep";
		}

}
	void takeSubject(String subject) {
		System.out.println(name+" studies java");
	}
	 void createEmail() {
		// TODO Auto-generated method stub
		
	}
}
