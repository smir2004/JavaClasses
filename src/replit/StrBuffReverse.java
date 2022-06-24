package replit;

public class StrBuffReverse {
	  static String s = "Hello Friends";
	  static String reverse = "";
      
  

	public static void main(String [] args) {
	for (int i = s.length() - 1; i >= 0; i--) {
          reverse = reverse + s.charAt(i);
      }
      System.out.println(reverse);


	}
	
}

