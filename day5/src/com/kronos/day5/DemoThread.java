package com.kronos.day5;

class MyJob implements Runnable {
	public void run(){
		System.out.println("Start:"+Thread.currentThread().getName());
		
		//5 sec
		try {
			if("bar".equals(Thread.currentThread().getName()))
				Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		System.out.println("End:"+Thread.currentThread().getName());
	}
}




public class DemoThread {
	public static void main(String[] args) {
		System.out.println();
		MyJob my = new MyJob();
		Thread t1= new Thread(my,"foo");
		Thread t2= new Thread(my,"bar");
		Thread t3= new Thread(my,"zar");
		t1.start();
		t2.start();

		t3.start();
		
		try {
			t1.join(700);
			t2.join(900);
			t3.join(600);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		System.out.println("main is done");

	}

}
