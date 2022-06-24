package com.syntax.class17;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
public static void removeDuplicates(int[] a) {
	LinkedHashSet<Integer> set
	=new LinkedHashSet<Integer>();
	for (int i=0; i<a.length; i++)
		set.add(a[i]);
	System.out.println(set);
}
public static void main(String[] args) {
	int a[]= {10,20,30,40,40
};
	removeDuplicates(a);
}
}