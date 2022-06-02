package com.syntax.class09;

public class HwClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hour = 0; hour <= 24; hour++) {
			for (int min = 0; min <= 59; min++) {
				if (hour < 10 && min < 10) {
					System.out.println("0" + hour + ":" + "0" + min);
				} else if (hour >= 10 && min >= 10) {
					System.out.println(hour + ":" + min);
	}
				
			}
		}
		
	}
}

