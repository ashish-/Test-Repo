package com.dsa.dynamic;

public class MaxSubArraySum {

	public static int maxSubArraySum(int a[],int n){
		int max_so_far=0,max=0;
		for(int i=0;i<n;i++){
			max= max+a[i];
			if(max < 0)
				max=0;
			if(max > max_so_far)
				max_so_far =max;
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_sum = maxSubArraySum(a, a.length);
		System.out.println(max_sum);
	}
}
