package com.syntax.class14;

public class GetGrade {
	char grade(int score) {
		if(score>=90) {
			return 'a';
		}else if(score>=80) {
			return 'b';
		}else if (score>=70) {
			return 'c';
		}else if(score >=50) {
			return 'd';
		}else { 
			return 'f';
		}
	}
 public static void main(String[] args) {
	GetGrade gG=new GetGrade();
	System.out.println(gG.grade(65));
}
}
