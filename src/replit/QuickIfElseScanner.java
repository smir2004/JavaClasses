package replit;
import java.util.Scanner;
public class QuickIfElseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
			 Scanner scanner=new Scanner(System.in);
		       		 System.out.println("Is it weekend?");
				 Boolean weekend=scanner.nextBoolean();
		  if (weekend ){
				     String subject="Java";
				     System.out.println("Today you will be learning "+ subject);
				   
				     }else {
		    String subject1="manual testing";
				    System.out.println("Today you will be learning "+subject1);
				}
		}
	}


