package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1;
while(num<=3){
	System.out.print(num+" ");
	num++;
}
System.out.println("-------------------------------");
int num1=11;
do {
	System.out.print(num1+" ");
	num1++;
} while (num1<=1);
//print 1 to 30 with do while
System.out.println("   --------------");
int b=1;
do {System.out.print(b+" ");
b++;
} while(b<=30);
//print even from 70 to 30
System.out.println();
int c=70;
do {System.out.print(c+" ");
c-=2;
}while (c>=30);
	}

}
