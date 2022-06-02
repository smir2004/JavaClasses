package FirstProject;

public class Code8Fabonici {

	public static void main(String[] args) {
		
			
			//  Q#8 Print the first 10 number of Fibonacci Series;
			// Fib#: 0 1 1 2 3 5 8 13 21 34;
			
			int a=0;
			int b=1;
			int c;
			System.out.print(a+" "+b);
			
			for (int i=3;i<=10;i++) {
					
			 c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			}	
		} 
	}

