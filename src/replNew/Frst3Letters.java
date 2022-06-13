package replNew;
import java.util.Scanner;
public class Frst3Letters {

	public static void main(String[] args) {
	
	String[]names = new String[5];
	  Scanner scan = new Scanner(System.in);
	  names [0]= scan.next();
	  names [1] =scan.next();
	  names [2]= scan.next();
	  names [3] =scan.next();
	  names [4]= scan.next();
	  for(int i = 0; i <= names.length-1; i++) {
		System.out.println(names[i].substring(0, 3));	
	  }
	  }
		
	}


