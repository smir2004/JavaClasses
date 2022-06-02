package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// print numbers from 1 to 100
		int num=1;
		
		while (num<=20) {
System.out.print(num+" ");
num++;
	}
		//// print numbers from 1 to 100
		int num1=0;
		while(num1<=10) {
			num1++;
			System.out.print(num1+" ");
		}
		//print 10 to 100
		System.out.println();
		int a=10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		//print to 10 to 1
		int b=10;
		while(b>=1) {
			System.out.print(b);
			b--;
		}
		//print -1 to -10
		int d=-1;
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		
		//print 1 to 20 only even numbers
		System.out.println();
				int e=2;
				while (e<=20) {
					System.out.print(e+" ");
					e+=2;
				}
				System.out.println();
				int f=1;
				while(f<=20) {
					if(f%2==0) {
					System.out.print(f+" ");
				
				}
		f++;	
	}
				//print only odd100 to 1
				System.out.println();
				int r=100;
				while(r>=1) {
					if(r%2!=0) {
						System.out.print(r+" ");
					}
					r--;
				}
				//aother way
				System.out.println();
				int y=99;
				while(y>=1) {
					System.out.print(y+" ");
					y-=2;
				}
}
}
