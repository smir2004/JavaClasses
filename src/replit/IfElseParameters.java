package replit;
import java.util.Scanner;
public class IfElseParameters {

	public static void main(String[] args) {
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("Please enter you mark");
						 int mark=scanner.nextInt();
				  if (mark>=80 ){
						     String result="A";
						     System.out.println("Your grade is "+ result);
						   
				}else if (mark==1 && mark<=25){
		        String result1="F";
		        System.out.println("Your grade is "+ result1);
				}else if (mark==25 && mark<=45){
		        String result3="E";
		        System.out.println("Your grade is "+ result3);
		    }
		      
		      
		      
		    
						}
				}
			

	
