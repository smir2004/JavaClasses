package FirstProject;

public class CodeTenSecondLrgst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,7};  
		   int i;
		    int secondLargest = a[0];
		    for (i = 1; i < a.length; i++)
		        if (a[i] > secondLargest)
		            secondLargest = a[i];
		
		
		System.out.println("Second Largest: "+secondLargest);  
		int [] numbers= { 1,4,6,8,10,14};
		int lrg1=0; int lrg2=0;
		for(int n=0;n<numbers.length;n++) {if(numbers[n]>lrg1) {
			lrg2=lrg1;
			lrg1=numbers[i];
		}else if(numbers[i]>lrg2) {lrg2=numbers[i];}
			
		}
		System.out.println(lrg2);
			}
		
		  
		} 
	


