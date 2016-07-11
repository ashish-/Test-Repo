package com.dsa.string;

import java.util.Arrays;

public class EncryptString {

	public static String reverse(char array[]){
		
		int left,right;
		left = 0;
		right = array.length-1;
		for(left=0;left<right; left++,right--){
			char temp =array[left];
			array[left] = array[right];
			array[right]= temp;
		}
		
		return String.valueOf(array);
			
	}
	public static String encrypt(String strs){
		
		int n= strs.length();
		int d=(strs.length()+1)/2;
		if(n>1){
			String left = strs.substring(0,d);
			left =reverse(left.toCharArray());
			left=encrypt(left);
			String right = strs.substring(d,n);
			right = reverse(right.toCharArray());
			right=encrypt(right);
						
			return left+right;
		}
		else{
			return strs;
		}
		
		
		
	}
	public static void main(String[] args) {
		String str ="hello";
		int n= str.length();
		int d=(str.length()+1)/2;
		//System.out.println(d);
		//System.out.println(str.substring(0, d));
		//System.out.println(str.substring(d, n));
		System.out.println(encrypt(str));
		//System.out.println(reverse(str.toCharArray()));
	}
}
