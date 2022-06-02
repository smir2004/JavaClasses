package FirstProject;

public class Code5EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integers. Develop a program
		//which will calculate the sum of  even and odd numbers
		//for that array.
		int[][]numbers= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
			for (int i=0;i<numbers.length; i++) {
			for (int y=0;y<numbers.length; y++) {
				if(numbers[i][y]%2==0) {
					System.out.println(numbers[i][y]+" ");
	}
	}
	}
	
	}

}
