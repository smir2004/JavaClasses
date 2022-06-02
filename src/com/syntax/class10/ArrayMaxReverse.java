package com.syntax.class10;

public class ArrayMaxReverse {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		int [] num= {231,451,761,671};
		
		
		    int i;
		    int max = num[0];
		    for (i = 1; i < num.length; i++)
		        if (num[i] > max)
		            max = num[i];
		 System.out.println(max);
		    //return max;
		    //int largest( num[], (n){

//Create an array to store char values and then print those in reverse order
		 char[] elements={'D','E','S','S','E','R','T','S'};
System.out.println("------------");
for (int i1= elements.length-1; i1>= 0 ; i1--){
    System.out.print(elements[i1]+" ");
}
//enhanced for loop cannot be reversed order
	}
}

