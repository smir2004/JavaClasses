package FirstProject;

public class Array7pPrimeOrNot {

	public static void main(String[] args) {
		// Write a java program to check whether a given
		//number is prime or not?
int num=33, i=2;
boolean flag=false;
while(i<=num/2) {
	if(num% i==0) {
	flag=true;
	break;
}
	++i;
	}
if(!flag) System.out.println(num+" is a prime number.");
else
	System.out.println(num+" is not a prime number.");

}
}
