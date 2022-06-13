package com.syntax.class14;

public class Prime {
	String prm(int a){
		String str="prime";
		if (a<=1) {
			str="not prime";
			
		}else {
		           	for(int i=0;i<=a/2;i++) {
				str="prime";
				break;
			}
		}
		return str;
	}
		public static void main (String[] args) {
			Prime num1=new Prime();
			System.out.println(num1.prm(46));
		} 
			
	
}
			
			
			
			
			
			
			


