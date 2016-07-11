package com.kronos.day3.session1;

public class Tester {
	  
		public static void main(String[] args) {
			
			String s1 = 3+3+
					"india"+3+3;
			String s2 = new String("india");
			
			if(s1.equals(s2))
					System.out.println("eq");
			else
				System.err.println("not");
			System.out.println(s1);
		}
}
