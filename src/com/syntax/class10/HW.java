package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] values = {2.99, 3.99, 4.99, 5.99};
		for (double num : values) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("Another way of performing the above is");
		for (int i = 0; i < values.length; i ++) {
			System.out.println(values[i] + " ");
		}
		System.out.println("different values");
		double[] value= {2.1,3.1,4.1,5.1};
		
	       for (int i=0; i<values.length; i++) {
	    	   System.out.print(value[i]+" ");
	       }
	  System.out.println();
	  //other enhanced loop
	  for (double valu:value) {
		  System.out.print(valu+" ");
	  }
	}
}

