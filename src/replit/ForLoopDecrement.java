package replit;
import java.util.Scanner;
public class ForLoopDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num=input.nextInt();
	    for (int i=(num-1); i>=0; i--){
	    	
	      System.out.print(i+" ");
	    }
	}

}
