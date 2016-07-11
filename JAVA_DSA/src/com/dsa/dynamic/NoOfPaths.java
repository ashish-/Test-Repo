package com.dsa.dynamic;

public class NoOfPaths {
		
	int countPath(int m,int n){
		
		int T[][] = new int[m][n];
		int i,j;
		for(i=0;i<m;i++)
			T[i][0]=1;
		for(j=0;j<n;j++)
			T[0][j]=1;
		for(i=1;i<m;i++)
			for(j=1;j<n;j++){
				T[i][j]=T[i-1][j]+T[i][j-1];
			}
		return T[m-1][n-1];
	}
	
	
	public static void main(String[] args) {
		
		NoOfPaths nop = new NoOfPaths();
		System.out.println(nop.countPath(3,3));
	}

}
