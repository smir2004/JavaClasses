package com.syntax.class14;

public class StrTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reverse string word by word
		String str="This is the sentance i want to reverse";
		String[] arr=str.split(" ");
		//for(String s:arr) {
			//System.out.print(new StringBuilder(s).reverse()+" ");
		//}
		System.out.println(new StringBuilder(str).reverse());
		
	}

}
