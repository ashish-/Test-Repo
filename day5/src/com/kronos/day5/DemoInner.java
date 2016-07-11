package com.kronos.day5;

class Outer{
	
	private int i=0;
	class Inner{
			private int i=9;
			void foo(){
				System.out.println(Outer.this.i);
			}
		
	}
	
	/*public void fun(){
		Inner inner = new Inner();
		inner.foo();
	}
	*/

}


public class DemoInner {

		public static void main(String[] args) {
			/*Outer o = new Outer();
			o.fun();*/
			
			Outer.Inner in = new Outer().new Inner();
			in.foo();
					
			
			
		}
}
