package replit;
import java.util.Scanner;
public class ScnLpDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of 
		//end(value must be taken from a user), exclusive.

//Each number should be on the same line, separated by a space.
		
		    Scanner input=new Scanner(System.in);
		    System.out.println("enter number");
		    int end=input.nextInt();
		    if (end<0){
		      System.out.println("no output");
		    }
		    for (int x=0; x<end*2; x++){
		      System.out.print(x+ " ");
		      input.close();
		    }
		  }

		
	}


