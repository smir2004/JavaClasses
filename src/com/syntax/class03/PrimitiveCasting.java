package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub1;
		
	int i=100;
	double d=100;
	System.out.println(i);
	System.out.println(d);// two types of casting widening and narrowing
	long l=10000; //byte,,,->short...->int...->long....->float....->double widening
	//double-> float -> long -> int ->short   -> byte narrowing/explicit/manually casting
int x=(int)99.99;
System.out.println(x);
byte b=(byte)130;
System.out.println(b);
System.out.println(l);

	}

}
