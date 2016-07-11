package com.dsa.dynamic;

public class Lcs {

	
	public int longest(int[] array){
		int i,j;
		int temp[] = new int[array.length];
		for(i=0;i<temp.length;i++)
			temp[i]=1;
		for(i=1;i<array.length;i++){
			for(j=0;j<i;j++){
				if(array[i]>array[j]){
					if(temp[j]+1 > temp[i])
						temp[i]= 1+ temp[j];
				}
			}
				
		}
		
		int max=0;
		for(i=1;i<temp.length;i++){
			if(temp[i]> temp[max]){
				max=i;
			}
		}
		return temp[max];
	}
	
	
	public static void main(String[] args) {
		Lcs lcs = new Lcs();
		int[] array = { 10, 22, 9, 33, 21, 50, 41, 60 };
		System.out.println(lcs.longest(array));
	}
}
