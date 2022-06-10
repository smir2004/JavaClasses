package FirstProject;
import java.util.Scanner;
public class Code2 {

	public static void main(String[] args) {
		//  Using Scanner create an array of countries. When an
		//array is created, retrieve all values from it and while
			//retrieving those values print capital for each country.
			//(use 2 different loops).
		Scanner scan=new Scanner(System.in);
		String capital=null;
		
		
		String[]countries=new String[4];
		countries[0]="USA";
		countries[1]="Ukraine";
		countries[2]="Mongolia";
	    countries[3]="Canada";
		for(int i=0;i<countries.length; i++ ) {
		System.out.println(countries[i]);
		}
		System.out.println("Enter country's name");
		String country=scan.next();
		if(country.equalsIgnoreCase("USA")) {
			capital="Washongton DC";
		}else if(country.equalsIgnoreCase("Ukraine")) {
			capital=("Kyiv");
		}else if(country.equalsIgnoreCase("Mongolia")) {
			capital=("Ulaanbaatar");
		}else if(country.contentEquals("Canada")) {
			capital="Ottawa";
		}
	System.out.println("The capital of "+country+" is "+capital);
	scan.close();
		
	    }
	}