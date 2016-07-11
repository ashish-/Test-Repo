package com.dsa.dynamic;

public class MinNumberOfCoins {

	public static  int minCoins(int coins[], int n, int V){
	
		int total[] = new int[V+1];
		total[0]=0;
		int i,j;
		for(i=1;i<=V;i++)
			total[i] = Integer.MAX_VALUE;
		
		for(i=1 ; i <=V ; i++) {
			
			for( j = 0 ; j < n ; j++){
				
				if( coins[j] <= i){
					int temp = total[i-coins[j]];
					if(temp!=Integer.MAX_VALUE && 1+ temp < total[i])
						total[i] = 1 + temp;
				}
			}
		}
		return total[V];
	}
	
	public static void main(String[] args) {
		
		int coins[] =  {9, 6, 5, 1};
	    
	    int V = 11;
	    
	    System.out.println(minCoins(coins, 4, V));
	}
}
