package com.syntax.class09;

public class SimpleClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int hrs=0; hrs<24;hrs++) {
	
for (int min=0; min<60; min++) {
		String time;
		if (hrs<=10 && min<=10) {
			time="0"+hrs+":"+"0"+min;
		}else if(hrs<=10 && min>=10) {
			time="0"+hrs+":"+min;
		}else if (hrs>=10 && min<=10) {
			
		}else {
			time=hrs+":"+min;
		}
		
	
}
	}

}
}
