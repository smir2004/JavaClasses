package FirstProject;

public class Code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum and minimum number in the array?
		int [] num= {2531,4651,761,6471};
		
		
	    int i;
	    int max = num[0];
	    for (i = 1; i < num.length; i++)
	        if (num[i] > max)
	            max = num[i];
	 System.out.println(max);
	 int j;
	 int min=num[0];
	 for (j=1; j>num.length;j--)
		 if (num[j]< min);
	 System.out.println(min);
			 min=num[j];
			 
				for (i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];
					}
					if (num[i] < min) {
						min = num[i];
					}
				}
				System.out.println(min);
				System.out.println(max);
			}
		
	}


