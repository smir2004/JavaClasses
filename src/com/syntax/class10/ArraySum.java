package com.syntax.class10;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] num= {231,451,761,671};
		System.out.println(num[0]+num[1]+num[2]+num[3]);
		
		System.out.println("diff way of doing");
		
		
		int[] num1= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<num1.length; i++) {
			sum=sum+num1[i];	
		}
		System.out.println("Sum of all elemenents="+sum);
		sum=0;
		for(int n:num1) {
			sum+=n;
		}
		System.out.println("Sum of all elemenents="+sum);

}
}
