package com.kronos.day5;


class Bar{
	
	private int i=0;
	 void barMethod(){

			final int id=88;
			class InnerBar{
				private int i;
				
				public void innerBarMethod(){
					System.out.println(id);
				}
			}
			
			InnerBar b= new InnerBar();
			b.innerBarMethod();
		
	}
	
	
	
}


public class DemoMethodLocalInner {

		public static void main(String[] args) {
			Bar bar = new Bar();
			bar.barMethod();
		}
}
