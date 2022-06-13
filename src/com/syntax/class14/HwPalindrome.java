package com.syntax.class14;

public class HwPalindrome {
	void HwPalindrome() {
	}
	boolean isPalindrome(String str) {
				StringBuilder in=new StringBuilder(str);
				in.reverse();
				if(in.reverse().equals(in)){
					return true;
				}else {
		return false;
	}
	}
public static void main(String [] args) {
	HwPalindrome word=new HwPalindrome();
	System.out.println(word.isPalindrome("racecar"));
	System.out.println(word.isPalindrome("turbo"));
}
}
