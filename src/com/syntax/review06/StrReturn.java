package com.syntax.review06;

public class StrReturn {
		// TODO Auto-generated method stub
		
		public static void main (String [] args) {
			Student stu=new Student();
			stu.name="Hira";
			stu.lastName="Pyava";
			stu.address="Virginia";
			stu.studentId=184;
			stu.age=25;
			stu.grade='A';
			
	stu.study();
	stu.doHomework();
	stu.getFullName();
	stu.rating();
	stu.printInfo();
	
	stu.takeSubject(null);

		}
}
