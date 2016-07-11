package com.kronos.day5;

import java.sql.ClientInfoStatus;

class client implements Runnable{
	
	private Thread thread;
	private Printer printer;
	private String letter;
	client(Printer printer,String letter){
		this.printer=printer;
		thread = new Thread(this);
		this.letter=letter;
		thread.start();
	}
	public void run(){
		printer.print(letter);
	}
}



class Printer{
	
	private Object object = new Object();
	//private static Printer printer = new Printer();
	
	
	public void print(String letter){
		
		
		synchronized (object) {
			System.out.println("<");
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				
			}
			System.out.println(letter+" >");
		}
		
		
		
	}
}




public class NeedOfSysncronizaation {
	public static void main(String[] args) {
		Printer printer= new Printer();
		client raja = new client(printer, "i love java");
		client ramesh = new client(printer, "i love my family");
		client ankur = new client(printer, "i love moving to new place");
		
	}
}
