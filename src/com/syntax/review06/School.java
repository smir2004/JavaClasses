package com.syntax.review06;

public class School {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Samira";
		student1.lastName="Pasheyava";
		student1.address="Virginia";
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		//student1.subject="java";
		Student student2=new Student();
		
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.address="California";
		student2.studentId=102;
		student2.age=18;
		student1.grade='A';
		System.out.println("----------------");
		student1.study();
		student2.study();
		student1.doHomework();
		student2.doHomework();
		student1.getFullName();
		student2.getFullName();
		student1.printInfo();
		student2.printInfo();
		
	}
	
	
	
	}
