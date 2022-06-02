package FirstProject;
import java.util.Scanner;
public class Code1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After
		//the array is created, calculate the sum of all stored
		//elements in that array.
		System.out.println("enter size of array");
		Scanner scan=new Scanner(System.in);
		
		int size=scan.nextInt();
		int array[]=new int [size];
		int sum=0;
			System.out.println("enter the elements of the array one by one");
			int array1=scan.nextInt();
			int array2=scan.nextInt();
			int array3=scan.nextInt();
		for(int i=0; i<size; i++) {
			sum=array1+array2+array3;
			System.out.println("sum of element of array :"+sum);
			
		}

		
		int sum1=0;
		System.out.println("Numbers to enter");
		
		int s = scan.nextInt();
		int [] numbers = new int[s];
		for(int x = 0; x<s; x++) {
			System.out.println("Please enter the number");
			numbers[x]=scan.nextInt();
			sum1+=numbers[x];
		}
		System.out.println("Sum of "+s+"numbers are= "+sum);
	}
}
			  