package com.syntax.class10;

public class Mumtaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempVal, size;
		int[] values = {5, 20, 100, 3, 6};
		size = values.length;
		
		for (int i = 0; i < size; i ++) {
			for (int j = i + 1; j < size; j ++) {
				if (values [i] > values [j]) {
				tempVal = values[i];
				values[i] = values[j];
				values[j] = tempVal;
				}
			}	
		}
		System.out.println("The largest element is " + values[size -1] );
		
		int[] array= {5,45,57,23,7,235};
		int max=array[0];
		for (int i=1; i< array.length; i++) {
			if(array[i]> max){
				max=array[i];
			}
		}
		System.out.println("largest element is "+max);
		
		//enhanced 
		max=array[0];
		for(int num:array) {
			if(num>max) {
				max=num;
		System.out.println("largest element is "+max);
			}
			
		}
		}
	}

