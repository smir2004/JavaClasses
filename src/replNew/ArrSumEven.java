package replNew;

public class ArrSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[][] a = {
					{-5,-2,-3,7},
					{1,-5,-2,2},
					{1,-2,3,-4}
				};
				  int even=0;
		    for(int i=0; i<a.length; i++){
		       for(int y=0; y<a.length-1; y++){
		        if(a[i][y]%2==0)
		        even+=a[i][y]; 
		        }
		  
		    }

			 System.out.println(even);
			}
		}
		  

