package com.syntax.class10;

public class MoreExEnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]nums= {                       ///enhanced loop
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787},
			};
		for(int[]num:nums) {//num is single array
			for(int n:num) {
				System.out.print(n+" ");
				System.out.println("-------------");
	}

}
	}
}
