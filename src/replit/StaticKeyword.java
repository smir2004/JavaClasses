package replit;

public class StaticKeyword {
	
		public static void main(String[] args) {
			int[][] a = {
				{1,2,3,4},
				{4,5,6,7},
				{1,3,5,7}
			};
			reduce10(a);
	    for(int i=0; i<a.length;i++){
	      for(int j=0; j<a[i].length;j++){
	        System.out.println();
	      }
	    }
		int[][] reduce10[][]arr){
	    for(int i=0; i<arr.length;i++){
	      for (int jo; j<arr[i].length;j++){
	        arr[i][j]=arr[i][j]-10;
	      
	      }
	    }
	    return arr;
	  }	
		
	}

		private static void reduce10(int[][] a) {
			// TODO Auto-generated method stub
			
		}

}
