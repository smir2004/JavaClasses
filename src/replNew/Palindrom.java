package replNew;
import java.util.Scanner;
public class Palindrom {

	
		boolean pali(String f){
			  StringBuilder s = new StringBuilder(f);
			  s.reverse();
			  if(f.equalsIgnoreCase(s.toString())){
			    return true;
			  }else{
			    return false;
			  }
			}
			  public static void main(String[] args) {
			    Scanner inp = new Scanner(System.in);
			    Palindrom x = new Palindrom();
			    System.out.print("In:");
			    System.out.println(x.pali(inp.nextLine()));
			  }
}
