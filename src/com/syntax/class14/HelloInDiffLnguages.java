package com.syntax.class14;

public class HelloInDiffLnguages {
//create a mthod that will say hello
	void hello (String hi) {
		if(hi.equalsIgnoreCase("urdu")) {
			System.out.println("salaam");
		}else if(hi.equalsIgnoreCase("french")) {
			System.out.println("bonjour");
				
		}else if(hi.equalsIgnoreCase("turkish")) {
			System.out.println("merhaba");
	}
}
	public static void main(String[] args) {
		HelloInDiffLnguages word=new HelloInDiffLnguages();
		word.hello("french");
		word.hello("urdu");
		word.hello("turkish");
	}
	
}
