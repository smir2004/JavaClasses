package replit;

public class TwoDarrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3, columns = 4;
		int[][] a = {
				{-5,-2,-3,7,},
				{1,-5,-2, 2},
				{1,-2, 3,-4,}
			};
			
			int[][] sum = new int[rows][columns];
        for(int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                sum= i[0]+i[1]+i[2]+i[3];
            }
        }
        // Displaying the sum matrix
        System.out.println("Sum of the given elements is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
		}
	}
	    
	}


