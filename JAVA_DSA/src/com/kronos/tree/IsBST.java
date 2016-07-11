package com.kronos.tree;

public class IsBST {

	
	
	public static void main(String[] args) {
		String str = "C:/Windows/system32/sqlncli11.dll";
		String temp="";
		if(str.contains("SysWOW64"))
			temp = str.replaceAll("SysWOW64", "system32");
		
		System.out.println(temp);
		
	}
	
	
}
