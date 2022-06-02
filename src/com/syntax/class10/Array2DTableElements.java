package com.syntax.class10;

public class Array2DTableElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] usa= {
		{"New York","Albany","Buffalo"},
		{"LA","San Fran", "San Jose","San Diego","Redding"},
		{"Miami","Orlando","Nicevilee","Tampa"},
	    {"Mclean","Richhmn","Leesburg"},
};
	    for(int row=0; row< usa.length; row++) {
	    	for(int col=0; col< usa[row].length; col++) {
	    		System.out.print(usa[row][col]+" ");
	    		
	    	}
	    }
	    System.out.println();
	    System.out.println("-------------");

System.out.println(usa[1][2]);
System.out.println(usa[2][0]);
System.out.println("Total # of 1D array in array usa = "+usa.length);
int elem1Array=usa[0].length;
System.out.println("# of elemesnts in 1st array is = "+elem1Array);
int elem2Array=usa[1].length;
System.out.println("# of elemesnts in 1st array is = "+elem2Array);

System.out.println("retrieve all values using for each loop");
for(String[] state:usa) {   ///enhanced loop
	for(String city:state) {
		System.out.print(city+" ");
	}
	
}
	}
}
