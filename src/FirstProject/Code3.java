package FirstProject;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Create a 2D array of integer values. Print the sum of
		//all numbers.
		int [] [] numbers=new int[3][4];
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
	

			int sum1 = 0;
			for (int[] arr : numbers)
			    for(int i: arr)
			        sum1+=i;

			System.out.println("The sum of all elements in this 2 dimensional array is "+sum1);
			}  


		

		

	}

