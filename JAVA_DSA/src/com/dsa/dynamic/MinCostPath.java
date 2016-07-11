package com.dsa.dynamic;

public class MinCostPath {

	int minCost(int cost[][],int m, int n ){
		
		int T[][] = new int[m][n];
		int i,j;
		T[0][0] = cost[0][0];
		for(i=1;i<m;i++)
			T[i][0] = cost[i][0]+T[i-1][0];
		for(j=1;j<n;j++)
			T[0][j] = cost[0][j]+T[0][j-1];
		for(i=1;i<m;i++)
			for(j=1;j<n;j++){
				T[i][j] = cost[i][j] + min(T[i-1][j],T[i][j-1],T[i-1][j-1]);
			}
		
		return T[m-1][n-1];
	}
	
	int min(int a,int b, int c){
		int l = Math.min(a, b);
		return Math.min(l, c);
	}
	
	
	
	public static void main(String[] args) {
		MinCostPath mcp = new MinCostPath();
        int cost[][] = {{1,2,3},{4,8,2},{1,5,3},{6,2,9}};
        int result = mcp.minCost(cost, cost.length, cost[0].length);
        System.out.println(result);
	}
}
