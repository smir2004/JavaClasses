package com.syntax.class07;
import java.util.Scanner;

public class LoopWithScannerDidUgetJob {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String job;
		
do {System.out.println("Did you get a job?");
job=scanner.nextLine();
	
}while (!job.equalsIgnoreCase("yes"));
System.out.println("Congratulations!");

System.out.println("--------------------------");

String offer;
System.out.println("did you do the dishes?");
offer=scanner.nextLine();
while(!offer.equalsIgnoreCase("yes")) {
	}
System.out.println("congratulations");

}
}
