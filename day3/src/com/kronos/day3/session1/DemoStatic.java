package com.kronos.day3.session1;

 class Demo{
	
	private int i;
	private static  int j;
	
	void foo(){
		System.out.println(i);
		System.out.println(j);
		
	}
	static void foo2(){
		//System.out.println(i);
		System.out.println(j);
	}
	
}




public class DemoStatic {
	public static void main(String[] args) {
		Demo a = new Demo();
		a.foo();
	}
}
