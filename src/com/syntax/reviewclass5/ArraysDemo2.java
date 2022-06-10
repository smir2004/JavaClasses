package com.syntax.reviewclass5;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[]names=new String[5];  //creates an empty array of size 5 to store string type values
//name[0]="Ahmed";
//name[2]="Kaiser";
Scanner zameer=new Scanner(System.in);
//names[0]=zameer.next();
//names[1]=zameer.next();
//names[2]=zameer.next();
//names[3]=zameer.next();
//names[4]=zameer.next();
for(int i=0; i<4;i++) {
	names[i]=zameer.next();
}

System.out.println(Arrays.toString(names));
zameer.close();//prints the values of array w/o loop
	}//in array, the index tells the distance from the starting element. So, the first element is at 0 distance from the 
		
}//starting element. So, that's why array start from 0.