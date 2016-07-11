package com.kronos.day3.session1;

public class DemoEquals {

	
		public static void main(String[] args) {
			Employee e1 = new Employee(121,"ashish",23);
			Employee e2 = new Employee(121,"ashish",23);
			
			if(e1.equals(e2))
				System.out.println("equal");
			else
				System.out.println("not equal");

		}
	
}
