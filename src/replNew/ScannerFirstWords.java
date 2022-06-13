package replNew;
import java.util.Scanner;

public class ScannerFirstWords {

	public static void main(String[] args) {
		//Using Scanner class input string value.
		//Print out the following: "The first 3 letters of ___ is ___"
		//For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
		// TODO Auto-generated method stub
			
		Scanner scanner=new Scanner(System.in);
		
		String word=scanner.nextLine();
		System.out.println(word.subSequence(0, 3)); 
	}

}
