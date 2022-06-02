package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] numbers=new int[3][4];
numbers[0][0]=10;
numbers[0][1]=20;
numbers[0][2]=30;
numbers[0][3]=40;
numbers[1][0]=1;
numbers[1][1]=2;
numbers[1][2]=3;
numbers[1][3]=4;
numbers[2][0]=9;
numbers[2][1]=8;
numbers[2][2]=7;
numbers[2][3]=6;
System.out.println(numbers[0][1]);
int rows=numbers.length;
System.out.println("number of rows is "+rows);


int col1stRow=numbers[0].length;

System.out.println("number of columns is "+col1stRow);
	}

}
