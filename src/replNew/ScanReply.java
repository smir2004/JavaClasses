package replNew;
import java.util.Scanner;

public class ScanReply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   String meaning = null;
		 
		  switch(language) {
		  case"java":
		  	meaning="programming";
		  	break;
		  case"C":
		  	meaning="procedural programming";
		  	break;
		  case"C++":
		  	meaning="middle-level programming";
		  	break;
		  	default:
		  		meaning="Unknown";
		  }
		  System.out.println(language+" is a "+meaning+" language");
		  
	}

}
