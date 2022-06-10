package com.syntax.reviewclass5;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row0[]= {1,2,3,4,5};
int row1[]= {1,2,3,4,5};
int row2[]= {1,2,3,4,5};
int row3[]= {1,2,3,4,5};
int row4[]= {1,2,3,4,5};
int[][] matrix=new int[5][5];
matrix[0]=row0;
matrix[1]=row0;
matrix[2]=row0;
matrix[3]=row0;
matrix[4]=row0;
//System.out.println(Arrays.toString(matrix[0]));//index
//System.out.println(matrix[0][2]);//elements inside of index
for(int[]array:matrix) {
	System.out.println(Arrays.toString(array));
}
	}

}
