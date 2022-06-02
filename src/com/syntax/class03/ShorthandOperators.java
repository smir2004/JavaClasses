package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		num=num+100; //reassigning the value
				System.out.println(num); //200
		num=num+50;
		System.out.println(num); //250
		num+=100; //num=num+100 plusequal
		System.out.println(num);
		num-=10; //num=num-10
		System.out.println(num);

		num/=10;
		System.out.println(num);
		num*=2;
		System.out.println(num);
		num%=2;
		System.out.println(num);
		int a=10;
		int b=20;
		int c=30;
		a+=b;
		System.out.println(a);
		
		a+=b+c;
		System.out.println(a);
		a*=10;
		System.out.println(a);
	}

}
