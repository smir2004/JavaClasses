package replit;
import java.util.Scanner;
public class ScnLpDoubletheEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner input=new Scanner(System.in);
		    System.out.println("enter a number");
		    int end=input.nextInt();
		    if (end<0){
		      System.out.println("no output");
		    }
		    for (int x=0; x<end*2; x++){
		      System.out.print(x+ " ");
		    }
		  }

		
	

}
