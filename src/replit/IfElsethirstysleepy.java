package replit;
import java.util.Scanner;

public class IfElsethirstysleepy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner scanner=new Scanner(System.in);
		 System.out.println("Are you thirsty?");
		 Boolean thirsty=scanner.nextBoolean();
		    System.out.println("Are you sleepy?");
		    Boolean sleepy=scanner.nextBoolean();
		   if (thirsty && sleepy ){
		     String result="coffee";
		     System.out.println("Looks like you need to drink "+ result);
		   } else if (thirsty && !sleepy){
		     String result1="water";
		     System.out.println("Looks like you need to drink "+ result1);
		   }else if (!thirsty && sleepy){
		     String result2="tea";
		     System.out.println("Looks like you need to drink "+ result2);   
		     
		     }else {
		    System.out.println("Looks like you need to drink nothing");
		}
		}
		
	}

